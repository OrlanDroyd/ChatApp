package com.gmail.orlandroyd.chatapp.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val username: String,
    val id: String,
)
