package com.example.myapplication

import android.content.Context
import android.content.res.Configuration
import android.graphics.Bitmap
import android.media.MediaMetadataRetriever
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_video.*
import java.lang.Exception

class Video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val media = MediaController(this)
        media.setAnchorView(video)
        val video1 =
            Uri.parse("https://ia801504.us.archive.org/16/items/youtube-1jUemn6Jk-o/1jUemn6Jk-o.mp4")
        video.setMediaController(media)
        video.setVideoURI(video1)
        video.requestFocus()
        video.start()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }
}

