package com.example.mm_music.Screens

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
import androidx.compose.ui.graphics.vector.ImageVector

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarFun(){
    TopAppBar(title = { "M-Music" },
         navigationIcon = {
             Icon(imageVector = Icons.Default.Menu,
                 contentDescription = "Menu")
         },
        actions = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search Songs")
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile")
        },
        scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(state = rememberTopAppBarState())
    )
}