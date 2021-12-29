package app.trian.cashierservice.entity

data class Device(
    var DeviceID:Long,
    var mac:String,
    var storeBranch:StoreBranch,
)