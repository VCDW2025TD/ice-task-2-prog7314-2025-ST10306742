package com.example.memestreamapp.data.network

import com.example.memestreamapp.data.model.Meme
import com.example.memestreamapp.data.model.MemePost
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET("memes")
    suspend fun getMemes(
        @Query("userId") userId: String? = null
    ): List<Meme>

    @POST("memes")
    suspend fun postMeme(
        @Body meme: MemePost
    ): Response<Meme>
}
