package models

import jakarta.persistence._

@Entity
class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = _

  @Column(nullable = false)
  var name: String = _

  var age: Int = _
}
