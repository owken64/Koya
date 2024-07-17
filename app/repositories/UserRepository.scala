
package repositories

import javax.inject.Inject
import models.User
import scala.jdk.CollectionConverters._
import jakarta.persistence.EntityManager
import play.db.jpa.JPAApi

//import providers.EntityManagerProvider

class UserRepository @Inject()(jpaApi: JPAApi) {
  //val em: EntityManager = jpaApi.em("defaultPersistenceUnit")
  val em: EntityManager = jpaApi.em("default")
  
  def findById(id: Long): Option[User] = {
    Option(em.find(classOf[User], id))
  }

  def findAll(): List[User] = {
    val javaList: java.util.List[User] = em.createQuery("SELECT u FROM User u", classOf[User]).getResultList
    val scalaList: List[User] = javaList.asScala.toList
    scalaList
  }

  def save(user: User): Unit = {
    em.getTransaction.begin()
    em.persist(user)
    em.getTransaction.commit()
  }

  def update(user: User): Unit = {
    em.getTransaction.begin()
    em.merge(user)
    em.getTransaction.commit()
  }

  def delete(user: User): Unit = {
    em.getTransaction.begin()
    em.remove(user)
    em.getTransaction.commit()
  }
}

