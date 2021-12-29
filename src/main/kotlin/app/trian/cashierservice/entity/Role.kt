package app.trian.cashierservice.entity

data class Role(
    var RoleID:Long,
    var role:String,
    val description:String,
    var createdAt:Long,
    var updatedAt:Long
)
