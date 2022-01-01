package app.trian.cashierservice.entity

import app.trian.cashierservice.model.UserType
import javax.persistence.*

@Entity
@Table
data class Users(
    @Id
    @GeneratedValue
    var UserID:Long,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "RoleID")
    var role:Roles?,
    @Column
    var uid:String,
    @Column
    var username:String,
    @Column
    var password:String,
    @Column
    var email:String,
    @Column
    var type:UserType,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)