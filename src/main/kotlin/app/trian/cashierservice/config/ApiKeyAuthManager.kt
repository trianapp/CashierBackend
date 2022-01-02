package app.trian.cashierservice.config

import app.trian.cashierservice.exception.UnAuthorizedException
import app.trian.cashierservice.repository.ApikeyRepository
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.core.Authentication

class ApiKeyAuthManager(
    private val apikeyRepository: ApikeyRepository
):AuthenticationManager {
    override fun authenticate(authentication: Authentication?): Authentication {
        val principal = authentication?.principal as String

        //find api key that exist?
        val exist = apikeyRepository.findTopByValue(principal)
        if(exist == null){
           throw UnAuthorizedException("You don't have permission!")
        }else{
            authentication.isAuthenticated = true
           return authentication
        }

    }
}