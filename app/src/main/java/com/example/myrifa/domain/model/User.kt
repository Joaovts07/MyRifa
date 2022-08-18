package com.example.myrifa.domain.model

import java.util.Date

data class User(
    val name: String,
    val number: String,
    val date: Date,
    val status: Status
)
