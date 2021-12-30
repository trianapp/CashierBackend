package app.trian.cashierservice.config

import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.core.Authentication

class ApiKeyAuthManager():AuthenticationManager {
    override fun authenticate(authentication: Authentication?): Authentication {
        val principal = authentication?.principal as String

        //find api key that exist?
        val exist = null
        if(exist == null){
           throw UnknownError("")
        }else{
            authentication.isAuthenticated = true
           return authentication
        }

    }
}