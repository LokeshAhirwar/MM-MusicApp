package com.example.mm_music.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarFun(){
    TopAppBar(title = { AppName() },
         navigationIcon = {
             Icon(imageVector = Icons.Default.Menu,
                 contentDescription = "Menu")
         },
        actions = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search Songs")
            Spacer(modifier = Modifier.width(10.dp))
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile")
        },
        scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(state = rememberTopAppBarState())
//        , colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
    )
}
@Composable
fun AppName(){
    Box(modifier = Modifier.fillMaxWidth().padding(start = 16.dp), contentAlignment = Alignment.Center){
        Text(text = "M- Music", fontWeight = FontWeight.Bold)
    }
}