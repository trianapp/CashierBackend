package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Products(
    @Id
    @GeneratedValue
    var ProductID:Long,
    @ManyToOne(
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "ProductCategoryID")
    var category: ProductCategory?,
    @OneToMany(
        mappedBy = "product",
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL]
    )
    var productSuppliers:List<ProductSuppliers> = emptyList(),
    @OneToOne
    var productDetails: ProductDetails?,
    @Column
    var productSupplier:String,
    @Column
    var storeBranchID: Long,
    @Column
    var description:String,
    @Column
    var buyUnitPrice:Double,
    @Column
    var unitInStock:Int,
    @Column
    var unitOnOrder:Int,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
