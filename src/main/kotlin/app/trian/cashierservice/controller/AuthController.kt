package app.trian.cashierservice.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * AuthController
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 30/12/21 23.36
 */
@RestController
class AuthController {
    @PostMapping(
        value = ["api/v1/login"],
        consumes = ["application/json"],
        produces = ["application/json"]
    )
    fun loginBasic() = "Login"

    @PostMapping(
        value = ["api/v1/register"],
        consumes = ["application/json"],
        produces = ["application/json"]
    )
    fun registerBasic() = "Login"

    @PostMapping(
        value = ["api/v1/login"],
        consumes = ["application/json"],
        produces = ["application/json"]
    )
    fun loginProvider() = "Login"

    @PostMapping(
        value = ["api/v1/register"],
        consumes = ["application/json"],
        produces = ["application/json"]
    )
    fun registerProvider() = "Login"
}