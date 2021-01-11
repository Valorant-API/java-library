package com.thoo.api.utils

import com.thoo.api.exceptions.ValorantApiException
import com.thoo.api.models.BaseModel
import retrofit2.Call

inline fun <reified T> Call<BaseModel<T>>.send(): BaseModel<T> {
    val response = this.execute();
    if(!response.isSuccessful) {
        throw ValorantApiException(response.code(), "Something went wrong.")
    }
    if(response.body() == null) {
        throw ValorantApiException(null, "Response is null.")
    }
    return response.body()!!
}