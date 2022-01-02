package app.trian.cashierservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Main Controller
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 30/12/21 23.36
 */
@RestController
class MainController {
    @GetMapping
    fun mainRoute(): Map<String, String> {
        return mapOf("a" to "b")
    }
}