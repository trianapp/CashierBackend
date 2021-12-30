package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class ProductDetails(
    @Id
    @GeneratedValue
    var ProductDetailID:Long,
    @OneToOne
    var products: Products,
    @Column
    var htmlDescription:String,
    @Column
    var thumbnail:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
