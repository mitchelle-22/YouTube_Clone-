package com.breens.youtubeclonestarter.data.api.model

import com.breens.youtubeclonestarter.data.api.model.ContentDetails
import com.breens.youtubeclonestarter.data.api.model.VideoDetails
import com.breens.youtubeclonestarter.data.api.model.VideoStats

data class YoutubeVideos(
    val id:String,
    val snippet: VideoDetails,
    val contentDetails : ContentDetails,
    val statistics : VideoStats

)
