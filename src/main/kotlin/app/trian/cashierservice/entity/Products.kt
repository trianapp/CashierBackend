package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Products(
    @Id
    @GeneratedValue
    var ProductID:Long,
    @OneToOne
    var category: ProductCategory,
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
