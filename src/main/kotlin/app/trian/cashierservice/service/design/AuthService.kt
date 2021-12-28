package app.trian.cashierservice.service.design

/**
 * Auth Service
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 28/12/21 13.42
 * this interface contains design that will be available
 */
interface AuthService {
    fun login()

    fun loginProvider()

    fun register()

    fun resetPassword()

}