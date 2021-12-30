package app.trian.cashierservice.entity

import com.fasterxml.jackson.annotation.JsonIgnore
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
    @OneToMany(
        mappedBy = "orders",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JsonIgnore
    var orderLines:List<OrderLines> = emptyList(),
    @OneToMany(
        mappedBy = "order",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    var invoices:List<Invoices> = emptyList(),
    @Column
    var orderStatus:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long,

)
