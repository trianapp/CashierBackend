package app.trian.cashierservice.entity

data class StoreBranch(
    var StoreBranchID:Long,
    var store: Store,
    var branchType:String,
    var branchName:String,
    var branchAddress:String,
    var branchPhone:String,
    var createdAt:Long,
    var updatedAt:Long
)
