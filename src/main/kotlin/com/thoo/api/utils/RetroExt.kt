package com.thoo.api.utils

import com.thoo.api.exceptions.ValorantApiError
import com.thoo.api.models.BaseModel
import retrofit2.Call

inline fun <reified T> Call<BaseModel<T>>.send(): BaseModel<T> {
    val response = this.execute();
    if(!response.isSuccessful) {
        throw ValorantApiError(response.code(), "Something went wrong.")
    }
    if(response.body() == null) {
        throw ValorantApiError(null, "Response is null.")
    }
    return response.body()!!
}