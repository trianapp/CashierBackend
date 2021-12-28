package app.trian.cashierservice.entity

data class User(
    var UserID:Long,
    var role:Role,
    var uid:String,
    var username:String,
    var password:String,
    var email:String,
    var createdAt:Long,
    var updatedAt:Long
)