package controllers

import javax.inject._
import play.api.mvc._
import repositories.UserRepository
import models.User
import javax.persistence.EntityManager
import play.db.jpa.JPAApi


@Singleton
class UserController @Inject()(cc: ControllerComponents, userRepository: UserRepository) extends AbstractController(cc) {

  def getUsers = Action { implicit request =>
    val users = userRepository.findAll()
    Ok(views.html.users(users))
  }

  def createUser() = Action { implicit request =>
    val newUser = new User()
    val formData = request.body.asFormUrlEncoded
    val name = formData.flatMap(_.get("name")).map(_.head).getOrElse("")
    val age = formData.flatMap(_.get("age")).map(_.head).getOrElse("")
    newUser.name = name
    newUser.age = age.toInt
    
    userRepository.save(newUser)

    Ok(s"User $name created with id ${newUser.id}")
  }

  def createEmptyUser() = Action { implicit request =>
    val newUser = new User()
    newUser.name = "NoName"
    newUser.age = 1
    
    userRepository.save(newUser)

    Ok(s"User NoName created with id ${newUser.id}")
  }

}
