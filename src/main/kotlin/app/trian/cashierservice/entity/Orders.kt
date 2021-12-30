package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Orders(
    @Id
    var OrderID:Long,
    @ManyToOne
    var employees: Employees,
    @ManyToOne
    var customers: Customers,
    @Column
    var orderStatus:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long,

)
