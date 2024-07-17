/*
import play.api.ApplicationLoader.Context
import play.api.db.evolutions.EvolutionsComponents
import play.api.db.DBComponents
import play.api.db.Database
import play.api.db.HikariCPComponents
import play.api.routing.Router
import play.api.ApplicationLoader.Context
import play.api.BuiltInComponentsFromContext
import play.filters.HttpFiltersComponents
import play.db.jpa.{JPAComponents, JPAApi}
import router.Routes

import repositories.UserRepository
import controllers.{HomeController, UserController, AssetsComponents, Assets}

class AppComponents(cntx: Context)
    extends BuiltInComponentsFromContext(cntx)
    with DBComponents
    with EvolutionsComponents
    with HikariCPComponents
    with HttpFiltersComponents
    with JPAComponents
    with AssetsComponents {

  // this will actually run the database migrations on startup
  applicationEvolutions

  lazy val userRepository = new UserRepository(jpaApi)

  // コントローラのインスタンスを作成
  lazy val homeController = new HomeController(controllerComponents)
  lazy val userController = new UserController(controllerComponents, userRepository)
  override lazy val assets = new Assets(httpErrorHandler, assetsMetadata)

  // デフォルトのルーターを指定
  lazy val router: Router = new Routes(
    httpErrorHandler,
    // ここに各コントローラを追加
    homeController,
    assets,
    userController
  )
}*/
