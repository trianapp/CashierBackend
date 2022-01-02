package app.trian.cashierservice.entity

import app.trian.cashierservice.model.EmployeeType
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
data class Employees(
    @Id
    @GeneratedValue
    var EmployeeID:Long,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "EmployeePositionID")
    var position: EmployeePosition?,
    @OneToOne
    @JoinColumn(name = "UserID")
    var user: Users?,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "StoreBranchID")
    var storeBranch: StoreBranch?,
    @OneToOne
    @JoinColumn(name="EmployeeID")
    var reportTo:Employees?,
    @OneToMany(
        mappedBy = "employees",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    var orders:List<Orders> = emptyList(),
    @Column
    var firstName:String,
    @Column
    var lastName:String,
    @Column
    var photo:String,
    @Column
    var type:EmployeeType,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)