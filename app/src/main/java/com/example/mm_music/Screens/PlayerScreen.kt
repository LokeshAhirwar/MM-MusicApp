package com.example.mm_music.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.mm_music.Data.listOfAlubm
import com.example.mm_music.R

@Composable
fun playerScreen(modifier: Modifier){
    var listofSongs by remember { mutableStateOf(listOfAlubm.first().songs) }
    var suffleOnOff by remember { mutableStateOf(false) }
    var playOnOff by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier
            .fillMaxSize()
            .blur(10.dp)
            .zIndex(-1f)){
            Image(painter = painterResource(R.drawable.s1), contentDescription = null, contentScale = ContentScale.FillHeight)
        }
        Column(modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Card(modifier= Modifier.size(350.dp),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(20.dp)
            ) {
                Image(painter = painterResource(R.drawable.s1), contentDescription = "songs", contentScale = ContentScale.Fit)
            }
            Column {
                Text(text = "Song Name")
                Text(text = "Artist Name")
            }

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                IconButton(onClick = { suffleOnOff = !suffleOnOff }) {
                    Icon(painter = painterResource(if(suffleOnOff) R.drawable.shuffle else R.drawable.shuffle_off),
                        contentDescription = "suffle")
                }
                IconButton(onClick = { }) {
                    Icon(painter = painterResource(R.drawable.backward), contentDescription = "backward")
                }
                IconButton(onClick = { playOnOff = !playOnOff }) {
                    Icon(painter = painterResource(if(playOnOff) R.drawable.music_note_2_play_20_regular else R.drawable.music_note_2_play_20_filled),
                        contentDescription = "play on off")
                }
                IconButton(onClick = { }) {
                    Icon(painter = painterResource(R.drawable.forward), contentDescription = "forward")
                }
                IconButton(onClick = { },modifier = Modifier.clip(shape = RectangleShape)) {
                    Icon(painter = painterResource(R.drawable.repeat), contentDescription = null,
                        modifier = Modifier.clip(shape = RectangleShape))
                }

            }

        }

    }
}