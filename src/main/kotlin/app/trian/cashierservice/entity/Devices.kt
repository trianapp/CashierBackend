package app.trian.cashierservice.entity

import javax.persistence.*

@Entity
@Table
data class Devices(
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
    @Column
    var updatedAt:Long
)