package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class OrderLines(
    @Id
    @GeneratedValue
    var OrderLineID:Long,
    @ManyToOne
    @JoinColumn(
        name = "orderLines"
    )
    var orders: Orders,
    @ManyToOne
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
