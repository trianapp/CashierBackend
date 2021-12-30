package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Employees(
    @Id
    @GeneratedValue
    var EmployeeID:Long,
    @OneToOne
    @JoinColumn(name = "EmployeePositionID")
    var position: EmployeePosition,
    @OneToOne
    @JoinColumn(name = "UserID")
    var user: User,
    @OneToOne
    @JoinColumn(name = "StoreBranchID")
    var storeBranch: StoreBranch,
    @Column
    var firstName:String,
    @Column
    var lastName:String,
    @OneToOne
    @JoinColumn(name="EmployeeID")
    var reportTo:Employees?,
    @Column
    var photo:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)