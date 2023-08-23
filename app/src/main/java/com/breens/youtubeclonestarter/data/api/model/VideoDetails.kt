package com.breens.youtubeclonestarter.data.api.model

import com.breens.youtubeclonestarter.data.api.model.Thumbnails

data class VideoDetails(
    val publishedAt : String,
    val title : String,
    val thumbnails : Thumbnails,
    val channelTitle : String
)
