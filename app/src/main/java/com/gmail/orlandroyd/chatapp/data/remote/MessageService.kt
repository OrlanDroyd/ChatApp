package com.gmail.orlandroyd.chatapp.data.remote

import com.gmail.orlandroyd.chatapp.domain.model.Message


interface MessageService {

    suspend fun getAllMessages(): List<Message>

    companion object {
        const val BASE_URL = "http://192.168.0.2:8082"
    }

    sealed class Endpoints(val url: String) {
        object GetAllMessages : Endpoints("$BASE_URL/messages")
    }

}