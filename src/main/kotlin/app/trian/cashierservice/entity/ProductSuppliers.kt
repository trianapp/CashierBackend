package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class ProductSuppliers(
    @Id
    @GeneratedValue
    var ProductSupplierID:Long,
    @ManyToOne
    var products: Products,
    @ManyToOne
    var suppliers: Suppliers,
    @Column
    var notes:String,
    @Column
    var buyPrice:Double,
    @Column
    var sellPrice:Double,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
