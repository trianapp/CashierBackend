package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Payment(
    @Id
    @GeneratedValue
    var PaymentID:Long,
    @OneToOne
    var order:Orders,
    @Column
    var paymentMethod:String,
    @Column
    var amount:Double,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
