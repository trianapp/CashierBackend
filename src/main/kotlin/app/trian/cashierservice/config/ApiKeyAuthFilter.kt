package app.trian.cashierservice.config

import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Get header for authorization
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 30/12/21 23.39
 */
class ApiKeyAuthFilter(val headerName:String):AbstractPreAuthenticatedProcessingFilter() {
    override fun getPreAuthenticatedPrincipal(request: HttpServletRequest?): String =
        request?.getHeader(headerName) ?: ""

    override fun getPreAuthenticatedCredentials(request: HttpServletRequest?): Any? = null

}