package app.trian.cashierservice.entity

data class ProductDetails(
    var ProductDetailID:Long,
    var product:String,
    var htmlDescription:String,
    var thumbnail:String,
    var createdAt:Long,
    var updatedAt:Long
)
