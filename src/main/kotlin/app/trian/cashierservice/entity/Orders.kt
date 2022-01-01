package app.trian.cashierservice.entity

import app.trian.cashierservice.model.OrderStatus
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table
data class Orders(
    @Id
    var OrderID:Long,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "EmployeeID")
    var employees: Employees?,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "CustomerID")
    var customers: Customers?,
    @OneToMany(
        mappedBy = "orders",
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    var orderLines:List<OrderLines> = emptyList(),

    @OneToMany(
        mappedBy = "order",
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    var invoices:List<Invoices> = emptyList(),
    @Column
    var orderStatus:OrderStatus,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long,

)
