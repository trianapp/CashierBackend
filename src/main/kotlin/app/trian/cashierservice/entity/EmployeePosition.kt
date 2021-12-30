package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class EmployeePosition(
    @Id
    @GeneratedValue
    var EmployeePositionID:Long,
    @Column
    var position:String,
    @Column
    var description:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
    )
