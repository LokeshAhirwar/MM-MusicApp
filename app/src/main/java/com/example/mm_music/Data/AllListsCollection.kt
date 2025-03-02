package com.example.mm_music.Data

import android.media.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.outlined.Search
import com.example.mm_music.R
import kotlin.random.Random

val listOfBottomIcon = listOf<BottomBarNavigationItem>(
    BottomBarNavigationItem(
        title = "Home",
        selected = Icons.Filled.Home,
        unSelected = Icons.Outlined.Home
    ) ,
    BottomBarNavigationItem(
        title = "Player",
        selected = Icons.Filled.PlayArrow,
        unSelected = Icons.Outlined.PlayArrow
    ),
    BottomBarNavigationItem(
        title = "Search",
        selected = Icons.Filled.Search,
        unSelected = Icons.Outlined.Search
    )


)
val listOfSongs = listOf(
    Song("song1","artist1",R.drawable.s1),
    Song("song2","artist2",R.drawable.s2),
    Song("song3","artist3",R.drawable.s3),
    Song("song4","artist4",R.drawable.s4),
    Song("song5","artist5",R.drawable.s5),
    Song("song1","artist1",R.drawable.s1),
    Song("song2","artist2",R.drawable.s2),
    Song("song3","artist3",R.drawable.s3),
    Song("song4","artist4",R.drawable.s4),
    Song("song5","artist5",R.drawable.s5),
    Song("song1","artist1",R.drawable.s1),
    Song("song2","artist2",R.drawable.s2),
    Song("song3","artist3",R.drawable.s3),
    Song("song4","artist4",R.drawable.s4),
    Song("song5","artist5",R.drawable.s5),
    Song("song1","artist1",R.drawable.s1),
    Song("song2","artist2",R.drawable.s2),
    Song("song3","artist3",R.drawable.s3),
    Song("song4","artist4",R.drawable.s4),
    Song("song5","artist5",R.drawable.s5),

)
val listOfAlubm = listOf(
    Album("album1","Love", R.drawable.album_photo,listOf(
        Song("song1","artist1",R.drawable.s1),
        Song("song2","artist2",R.drawable.s2),
        Song("song3","artist3",R.drawable.s3),
        Song("song4","artist4",R.drawable.s4),
        Song("song5","artist5",R.drawable.s5),

    )),
    Album("album2","Love", R.drawable.album_image1,listOf(
        Song("sodsfsd","artist1",R.drawable.s1),
        Song("dsfa","artist2",R.drawable.s2),
        Song("sdfs","artist3",R.drawable.s3),
        Song("dsfas","artist4",R.drawable.s4),
        Song("sdfsa","artist5",R.drawable.s5),

        )),
    Album("album3","Love", R.drawable.album_image3,listOf(
        Song("dfad","artist1",R.drawable.s1),
        Song("dfasdsgasfd","artist2",R.drawable.s2),
        Song("3456","artist3",R.drawable.s3),
        Song("son23456789g4","artist4",R.drawable.s4),
        Song("2345678909876543","artist5",R.drawable.s5),

        )),
    Album("album4","Love", R.drawable.album_image4,listOf(
        Song("song1","artist1",R.drawable.s1),
        Song("song2","artist2",R.drawable.s2),
        Song("song3","artist3",R.drawable.s3),
        Song("song4","artist4",R.drawable.s4),
        Song("song5","artist5",R.drawable.s5),

        )),
    Album("album5","Love", R.drawable.album_image5,listOf(
        Song("song1","artist1",R.drawable.s1),
        Song("song2","artist2",R.drawable.s2),
        Song("song3","artist3",R.drawable.s3),
        Song("song4","artist4",R.drawable.s4),
        Song("song5","artist5",R.drawable.s5),

        )),
    Album("album6","Love", R.drawable.album_image1,listOf(
        Song("song1","artist1",R.drawable.s1),
        Song("song2","artist2",R.drawable.s2),
        Song("song3","artist3",R.drawable.s3),
        Song("song4","artist4",R.drawable.s4),
        Song("song5","artist5",R.drawable.s5),

        )),
    Album("album7","Love", R.drawable.album_image2,listOf(
        Song("song1","artist1",R.drawable.s1),
        Song("song2","artist2",R.drawable.s2),
        Song("song3","artist3",R.drawable.s3),
        Song("song4","artist4",R.drawable.s4),
        Song("song5","artist5",R.drawable.s5),

        )),
    Album("album8","Love", R.drawable.s3,listOf(
        Song("song1","artist1",R.drawable.s1),
        Song("song2","artist2",R.drawable.s2),
        Song("song3","artist3",R.drawable.s3),
        Song("song4","artist4",R.drawable.s4),
        Song("song5","artist5",R.drawable.s5),

        )),
)