package com.breens.youtubeclonestarter.repository

import com.breens.youtubeclonestarter.data.api.api.YoutubeApi
import com.breens.youtubeclonestarter.data.api.model.YoutubeResponse
import retrofit2.Response
import javax.inject.Inject

class FetchPopularVideoRepository @Inject constructor(
    private val api: YoutubeApi
) {
    suspend fun getPopularVideos(): Response<YoutubeResponse>{
        return api.fetchVideos()
    }
}