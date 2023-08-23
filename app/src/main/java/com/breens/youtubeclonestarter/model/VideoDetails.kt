package com.breens.youtubeclonestarter.model

data class VideoDetails(
    val publishedAt : String,
    val title : String,
    val thumbnails :Thumbnails,
    val channelTitle : String
)
