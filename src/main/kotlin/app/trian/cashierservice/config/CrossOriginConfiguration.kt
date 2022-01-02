package app.trian.cashierservice.config

import app.trian.cashierservice.repository.ApikeyRepository
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.authentication.logout.LogoutFilter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

/**
 * Cross
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 30/12/21 23.42
 */
@Configuration
@EnableWebSecurity
class CrossOriginConfiguration(
    private val filerExceptionHandler: FilterChainExceptionHandler,
    private val apikeyRepository: ApikeyRepository
) :WebSecurityConfigurerAdapter(){

    override fun configure(http: HttpSecurity) {
       // super.configure(http)
        val apiKeyAuthFilter = ApiKeyAuthFilter("x-api-key")
        apiKeyAuthFilter.setAuthenticationManager(ApiKeyAuthManager(apikeyRepository))
        http
            .addFilterAfter(filerExceptionHandler,LogoutFilter::class.java)
            .csrf()
            .disable()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .addFilter(apiKeyAuthFilter)
            .authorizeRequests()
            .antMatchers("/api/**")
            .permitAll()
            .and()
            .cors()
            .configurationSource(corsConfigurationSource("*"))
    }
    private fun corsConfigurationSource(corsOrigin: String): CorsConfigurationSource {
        val configuration = CorsConfiguration()
        configuration.addAllowedOrigin("*")
        configuration.allowedOrigins = listOf(corsOrigin)
        configuration.allowedMethods = listOf(
            "GET", "POST", "HEAD", "OPTIONS", "PUT", "PATCH", "DELETE"
        )
        configuration.maxAge = 10L
        //when this true the origin = * cannot be used any more
        // configuration.allowCredentials = true
        configuration.allowedHeaders = listOf(
            "Accept",
            "Access-Control-Request-Method",
            "Access-Control-Request-Headers",
            "Access-Control-Allow-Origin",
            "Access-Control-Expose-Headers",
            "Accept-Language",
            "Authorization",
            "Content-Type",
            "Request-Name",
            "Request-Surname",
            "Origin",
            "X-Api-Key",
            "X-Request-AppVersion",
            "X-Request-OsVersion",
            "X-Request-Device",
            "X-Requested-With"
        )
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", configuration)

        return source
    }
}