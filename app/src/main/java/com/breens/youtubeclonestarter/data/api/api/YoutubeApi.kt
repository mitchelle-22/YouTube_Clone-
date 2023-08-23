package com.breens.youtubeclonestarter.data.api.api

import com.breens.youtubeclonestarter.data.api.model.YoutubeResponse
import com.breens.youtubeclonestarter.utils.Constant.Companion.LIST_OF_VIDEOS
import com.breens.youtubeclonestarter.utils.Constant.Companion.SNIPPET
import com.breens.youtubeclonestarter.utils.Constant.Companion.DETAILS
import com.breens.youtubeclonestarter.utils.Constant.Companion.KEY
import com.breens.youtubeclonestarter.utils.Constant.Companion.MOST_POPULAR
import com.breens.youtubeclonestarter.utils.Constant.Companion.REGION_CODE
import com.breens.youtubeclonestarter.utils.Constant.Companion.STATISTICS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeApi {

    @GET(LIST_OF_VIDEOS)
    suspend fun fetchVideos(
        @Query("part")part :String ="$SNIPPET,$DETAILS,$STATISTICS",
        @Query("chart")chart : String = MOST_POPULAR,
        @Query("regionCode") regionCode : String = REGION_CODE,
        @Query("key")key:String = KEY

    ):Response<YoutubeResponse>
}