package com.example.mm_music.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.mm_music.R

@Composable
//fun homeScreen(modifier: Modifier){
fun homeScreen(modifier: Modifier){
//    Box(modifier = Modifier.fillMaxSize()
//        .blur(10.dp)){
//        Image(painter = painterResource(R.drawable.bg2), contentScale = ContentScale.FillBounds,
//            contentDescription = "background image")
//    }
    Column(modifier = modifier.fillMaxSize()
        .padding(start = 8.dp, end = 8.dp, top = 8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "View All",
            fontWeight = FontWeight.ExtraBold
            , fontSize = 30.sp)
        albumCard()
    }


}
@Composable
//fun albumCard(album: Album)
fun albumCard(){

    var SelectedSong by remember { mutableStateOf(listOfAlubm.first().songs) }
    LazyRow(modifier = Modifier.fillMaxWidth().height(170.dp)
        .padding(start =  8.dp, top = 10.dp, end = 8.dp)) {
        items(listOfAlubm){album->
            Column(modifier = Modifier.padding(horizontal = 7.dp)) {
                Card(modifier = Modifier.size(100.dp)
                    .clickable(onClick = { SelectedSong = album.songs}),
                    shape = RoundedCornerShape(20.dp)) {
                    Image(painter = painterResource(album.imagres), contentDescription = "Album photo", contentScale = ContentScale.Crop)
                }
                Text(text = album.catgory,
                    fontSize = 20.sp
                , fontWeight = FontWeight.Bold)
                Text(text = album.name,
                    fontWeight = FontWeight.Light,
                    fontSize = 15.sp)
            }

        }

    }
    LazyColumn(modifier = Modifier.fillMaxSize().padding(start =  8.dp)) {
        items(SelectedSong){song->
            Row(modifier = Modifier.padding(vertical = 10.dp)) {
                Card(modifier = Modifier.size(80.dp).weight(0.9f),
                    shape = RoundedCornerShape(10.dp)) {
                    Image(painter = painterResource(song.simage), contentScale = ContentScale.Crop, contentDescription = "Song Image")

                }
                Column(modifier = Modifier.padding(start = 10.dp).weight(2f)) {
                    Text(text = song.title,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)

                    Text(text = song.artist,
                        fontWeight = FontWeight.Light,)

                }
                IconButton(onClick = { }, modifier = Modifier.weight(1f)) {
                    Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "play song")
                }

            }


        }
    }




}
