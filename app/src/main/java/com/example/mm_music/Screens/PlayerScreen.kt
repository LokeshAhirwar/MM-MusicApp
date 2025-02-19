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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.mm_music.R

@Composable
fun playerScreen(modifier: Modifier){
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
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = null)
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null,modifier = Modifier.size(50.dp))
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Refresh, contentDescription = null)
                }

            }

        }

    }
}