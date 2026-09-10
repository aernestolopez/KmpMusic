package org.example.kmpmusic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform