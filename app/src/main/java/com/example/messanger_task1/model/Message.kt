package dev.ogabek.kotlin.model

data class Message(
    val profile: Int,
    val fullName: String,
    val isOnline: Boolean = false
)
