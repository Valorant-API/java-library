package com.thoo.api.services

import com.thoo.api.models.*
import retrofit2.Call
import retrofit2.http.GET

interface ValorantApiService {

    companion object {
        const val BASE_URL = "https://valorant-api.com/v1/";
    }

    @GET("/v1/agents")
    fun agents(): Call<BaseModel<Array<Agent>>>

    @GET("/v1/buddies")
    fun buddies(): Call<BaseModel<Array<Budy>>>

    @GET("/v1/playercards")
    fun cards(): Call<BaseModel<Array<Card>>>

    @GET("/v1/contenttiers")
    fun contentTiers(): Call<BaseModel<Array<ContentTier>>>

    @GET("/v1/currencies")
    fun currencies(): Call<BaseModel<Array<Currency>>>

    @GET("/v1/gamemodes")
    fun gamemodes(): Call<BaseModel<Array<Gamemode>>>

    @GET("/v1/gamemodes/equippables")
    fun gamemodeEquippable(): Call<BaseModel<Array<GamemodeEquippable>>>

    @GET("/v1/maps")
    fun maps(): Call<BaseModel<Array<ValorantMap>>>

    @GET("/v1/seasons")
    fun seasons(): Call<BaseModel<Array<Season>>>

    @GET("/v1/themes")
    fun themes(): Call<BaseModel<Array<Theme>>>

    @GET("/v1/playertitles")
    fun titles(): Call<BaseModel<Array<Title>>>

    @GET("/v1/weapons")
    fun weapons(): Call<BaseModel<Array<Weapon>>>

    @GET("/v1/version")
    fun version(): Call<BaseModel<Version>>

    @GET("/v1/sprays")
    fun sprays(): Call<BaseModel<Array<Spray>>>

}