package com.example.domain.model

import java.security.Principal

data class UserSession(
    val id : String,
    val name : String
) : io.ktor.server.auth.Principal
