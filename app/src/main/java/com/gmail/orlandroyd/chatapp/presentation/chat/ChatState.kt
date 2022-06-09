package com.gmail.orlandroyd.chatapp.presentation.chat

import com.gmail.orlandroyd.chatapp.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false,
)