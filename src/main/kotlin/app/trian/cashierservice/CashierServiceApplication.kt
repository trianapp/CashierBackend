package app.trian.cashierservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CashierServiceApplication

fun main(args: Array<String>) {
    runApplication<CashierServiceApplication>(*args)
}
