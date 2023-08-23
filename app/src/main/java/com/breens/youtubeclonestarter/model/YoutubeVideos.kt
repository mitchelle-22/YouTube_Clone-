package com.breens.youtubeclonestarter.model

data class YoutubeVideos(
    val id:String,
    val snippet:VideoDetails,
    val contentDetails : ContentDetails,
    val statistics : VideoStats

)
