package com.thoo.api.models

data class BaseModel<T>(
    val status: Int,
    val data: T
)