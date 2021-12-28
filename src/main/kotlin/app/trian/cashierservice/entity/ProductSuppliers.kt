package app.trian.cashierservice.entity

data class ProductSuppliers(
    var ProductSupplierID:Long,
    var products: Products,
    var suppliers: Suppliers,
    var notes:String,
    var buyPrice:Double,
    var sellPrice:Double,
    var createdAt:Long,
    var updatedAt:Long
)
