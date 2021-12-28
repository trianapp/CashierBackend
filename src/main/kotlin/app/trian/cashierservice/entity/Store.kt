package app.trian.cashierservice.entity

data class Store(
    var StoreID:Long,
    var storeName:String,
    var storeLogo:String,
    var storeAddress:String,
    var createdBy:Long,
    var createdAt:Long,
    var updatedAt:Long
)
