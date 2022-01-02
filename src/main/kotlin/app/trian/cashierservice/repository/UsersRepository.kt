package app.trian.cashierservice.repository

import app.trian.cashierservice.entity.Users
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 01/01/22 20.17
 */
interface UsersRepository:PagingAndSortingRepository<Users,Long> {
    fun findTopByUsernameAndPassword(username: String, password: String):Users?

    fun findTopByUid(uid: String):Users?

    fun findTopByUsername(username: String):Users?

}