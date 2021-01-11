package com.thoo.api

import com.google.gson.*
import com.thoo.api.models.*
import com.thoo.api.services.ValorantApiService
import com.thoo.api.utils.send
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Modifier
import java.lang.reflect.Type
import java.math.BigDecimal

class ValorantApi(
    client: OkHttpClient = OkHttpClient()
) {

    private val gson = GsonBuilder()
        .setPrettyPrinting()
        .excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.STATIC, Modifier.VOLATILE)
        .registerTypeAdapter(Double::class.java, object: JsonSerializer<Double> {
            override fun serialize(src: Double?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
                val value = BigDecimal.valueOf(src ?: 0.toDouble())
                return JsonPrimitive(value)
            }
        }).create()

    private val retrofit: Retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl("https://valorant-api.com/v1/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    private val service = retrofit.create(ValorantApiService::class.java)

    fun getAgents(): BaseModel<Array<Agent>> = service.agents().send()
    fun getBuddies(): BaseModel<Array<Budy>> = service.buddies().send()
    fun getCards(): BaseModel<Array<Card>> = service.cards().send()
    fun getContentTiers(): BaseModel<Array<ContentTier>> = service.contentTiers().send()
    fun getCurrencies(): BaseModel<Array<Currency>> = service.currencies().send()
    fun getGamemodes(): BaseModel<Array<Gamemode>> = service.gamemodes().send()
    fun getGamemodeEquippable(): BaseModel<Array<GamemodeEquippable>> = service.gamemodeEquippable().send()
    fun getMaps(): BaseModel<Array<ValorantMap>> = service.maps().send()
    fun getSeasons(): BaseModel<Array<Season>> = service.seasons().send()
    fun getThemes(): BaseModel<Array<Theme>> = service.themes().send()
    fun getTitles(): BaseModel<Array<Title>> = service.titles().send()
    fun getWeapons(): BaseModel<Array<Weapon>> = service.weapons().send()
    fun getVersion(): BaseModel<Version> = service.version().send()

}