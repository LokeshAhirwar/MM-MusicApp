package com.example.mm_music.Data

import android.media.Image

data class Album(
    val name: String,
    val catgory: String,
    val imagres: Int,
    val songs: List<Song>
)
