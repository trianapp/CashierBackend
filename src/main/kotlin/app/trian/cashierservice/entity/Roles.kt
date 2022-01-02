package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Roles(
    @Id
    @GeneratedValue
    var RoleID:Long,
    @Column
    var role:String,
    @Column
    val description:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
