package app.trian.cashierservice.entity

data class Products(
    var ProductID:Long,
    var category: ProductCategory,
    var productSupplier:String,
    var storeBranchID: Long,
    var description:String,
    var buyUnitPrice:Double,
    var unitInStock:Int,
    var unitOnOrder:Int,
    var createdAt:Long,
    var updatedAt:Long
)
