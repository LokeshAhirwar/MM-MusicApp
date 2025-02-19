package com.example.mm_music.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mm_music.Data.Album
import com.example.mm_music.Data.Song
import com.example.mm_music.Data.listOfAlubm
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

@Composable
fun homeScreen(modifier: Modifier){

    Column(modifier = modifier,
        verticalArrangement = Arrangement.Center
        ) {
       Text(text = "View All")
        albumCard()
    }

}
@Composable
//fun albumCard(album: Album)
fun albumCard(){

    var SelectedSong: MutableList<Song> = mutableListOf()
    LazyRow(modifier = Modifier.fillMaxWidth().height(150.dp)) {
        items(listOfAlubm){album->
            Column(modifier = Modifier.padding(horizontal = 7.dp)) {
                Card(modifier = Modifier.size(100.dp)
                    .clickable(onClick = { SelectedSong = album.songs as MutableList<Song> }),
                    shape = RoundedCornerShape(20.dp)) {
                    Image(painter = painterResource(album.imagres), contentDescription = "Album photo", contentScale = ContentScale.Crop)
                }
                Text(text = album.catgory)
                Text(text = album.name)

            }

        }

    }
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(SelectedSong){song->
            Text(text = song.title)

        }
    }




}
