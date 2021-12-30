package app.trian.cashierservice.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
data class Role(
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
