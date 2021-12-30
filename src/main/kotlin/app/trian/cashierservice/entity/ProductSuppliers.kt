package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class ProductSuppliers(
    @Id
    @GeneratedValue
    var ProductSupplierID:Long,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "ProductID")
    var product: Products,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "SupplierID")
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
