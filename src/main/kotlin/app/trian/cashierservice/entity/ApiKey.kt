package app.trian.cashierservice.entity

import org.apache.juli.logging.Log
import javax.persistence.*

@Entity
@Table
data class ApiKey(
    @Id
    @GeneratedValue
    var id:Long,
    @Column
    var value:String,
    @Column
    var createdAt:Long,
    @Column
    var updatedAt:Long
)
