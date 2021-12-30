package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class OrderLines(
    @Id
    @GeneratedValue
    var OrderLineID:Long,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "OrderID")
    var orders: Orders,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "ProductID")
    var products: Products,
    @Column
    var quantity:Int,
    @Column
    var unitPrice:Double,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
