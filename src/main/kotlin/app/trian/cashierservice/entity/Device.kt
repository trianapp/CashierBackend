package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Device(
    @Id
    @GeneratedValue
    var DeviceID:Long,
    @Column
    var mac:String,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "StoreBranchID")
    var storeBranch:StoreBranch?=null,
    @Column
    var createdAt:Long,
    var updatedAt:Long
)