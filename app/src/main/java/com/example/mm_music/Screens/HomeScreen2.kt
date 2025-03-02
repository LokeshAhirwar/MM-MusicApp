package com.example.mm_music.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mm_music.Data.Song
import com.example.mm_music.Data.listOfSongs

@Composable
fun homeScreen2(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row { Text(text = "Top Songs") }
        LazyRow {
            items(listOfSongs){ song ->



            }
        }


    }

}
@Composable
fun SongCard(){

}