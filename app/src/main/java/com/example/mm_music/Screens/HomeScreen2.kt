package com.example.mm_music.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons.AutoMirrored.Rounded
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mm_music.Data.Song
import com.example.mm_music.Data.listOfSongs

@Composable
fun homeScreen2(modifier: Modifier){
   LazyColumn(modifier = modifier.fillMaxWidth(),
//       .background(),
       contentPadding = PaddingValues(16.dp),
       verticalArrangement = Arrangement.spacedBy(16.dp)) {
       item{
           topSongText()
       }
       item{
           topSongSection(song = listOfSongs)
       }
       item{
                artistYouLike("Artists you like")
       }
       item{
           artistCard(song = listOfSongs)
       }
       item{
           recentlyPlayedText("Recently Played")
       }
       item{
           recentlyPlayed(song = listOfSongs)
       }

   }

}
@Composable
fun topSongText(){
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Top Songs", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(text = "View All", color = Color.Black)

        }
    }
}
@Composable
fun topSongSection(song:List<Song>){
    LazyRow {
        items(song){song->
            Column(modifier = Modifier.padding(horizontal = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Card(modifier = Modifier.size(150.dp),
                    shape = RoundedCornerShape(20.dp)) {
                    Image(painter = painterResource(song.simage), contentScale = ContentScale.Crop,
                        contentDescription = "Song image")
                }
                Text(text = song.title)
            }

        }
    }
}
@Composable
fun artistYouLike(text: String){
    Text(text = text, fontSize = 20.sp, fontWeight = FontWeight.Bold)
}
@Composable
fun artistCard(song: List<Song>){
    LazyRow {
        items(song){ar->
            Column(modifier = Modifier.padding(horizontal = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Card(modifier = Modifier.size(100.dp),
                    shape = CircleShape
                    ) {
                    Image(painter = painterResource(ar.simage), contentScale = ContentScale.Crop, contentDescription = "artists images")

                }
                Text(text = ar.artist)

            }

        }
    }
}
@Composable
fun recentlyPlayedText(text: String){
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = text, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(text = "View All", color = Color.Black)

        }
    }
}
@Composable
fun recentlyPlayed(song: List<Song>){
    LazyRow {
        items(song){song->
            Column(modifier = Modifier.padding(horizontal = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Card(modifier = Modifier.size(150.dp),
                    shape = RoundedCornerShape(20.dp)) {
                    Image(painter = painterResource(song.simage), contentScale = ContentScale.Crop,
                        contentDescription = "Song image")
                }
                Text(text = song.title)
            }

        }
    }

}

