package com.alphaomardiallo.katproto

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform