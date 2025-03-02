package com.example.mm_music.Screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mm_music.Data.Song
import com.example.mm_music.Data.listOfSongs
import com.example.mm_music.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun searchScreen(modifier: Modifier){
    Column(modifier = Modifier.fillMaxSize().padding(top = 70.dp)
    ) {
        var isSearchBarActive  by remember { mutableStateOf(false) }
        var SearchQuery by remember { mutableStateOf("") }
        var searchResult by remember { mutableStateOf<List<Song>>(emptyList())}
//        var searchResult by remember { mutableStateListOf<Song>() }
        var Suggestions = remember { mutableStateListOf("lokesh","lokesh Smarter","lokesh Smartest") }
        var showSearchScreen by remember { mutableStateOf(false) }

        SearchBar(
            modifier = Modifier.fillMaxWidth()
//                .padding(10.dp)
            ,
            query = SearchQuery,
            onQueryChange = { SearchQuery = it},
            active = isSearchBarActive,
            onSearch = {
                if(SearchQuery.isEmpty()){
                    isSearchBarActive = false

                }else {
                    Suggestions.add(SearchQuery)
                }
                showSearchScreen = true
                isSearchBarActive = false
                searchResult = SearchResultScreen(it)
                       SearchQuery = ""
                },
            onActiveChange = { isSearchBarActive = it },
            placeholder = { Text(text = "Get your music here")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = " Search Icon") },
            trailingIcon = {
                if(isSearchBarActive){
                    IconButton(onClick = { if(SearchQuery.isNotEmpty()){
                        SearchQuery = ""
                    }else{
                        isSearchBarActive = false
                    }
                    }) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "Close Search Bar")
                    }
                }
            }



        ) {
            Suggestions.forEach(){
                Row(modifier = Modifier.padding(5.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(R.drawable.history), contentDescription = "history Icon",
                        modifier = Modifier.padding(horizontal = 8.dp).size(30.dp))
                    Text(text =  it)
                }

            }
        }
        if(showSearchScreen){
            Text(text = "Top Results", fontWeight = FontWeight.Bold, fontSize = 20.sp,modifier = Modifier.padding(top = 10.dp))
            LazyColumn(modifier = Modifier.fillMaxSize().padding(start = 8.dp, end =  8.dp, top = 15.dp)) {
                items(searchResult){ song->
                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 5.dp)
                        , verticalAlignment = Alignment.CenterVertically) {
                        Card(modifier = Modifier.size(50.dp)
                        ) {
                            Image(painter = painterResource(song.simage), contentDescription = "song image", contentScale = ContentScale.Crop)

                        }

                        Text(text = song.title,modifier = Modifier.padding(start = 10.dp))

                    }

                }

            }
        }
    }




}

fun SearchResultScreen(texts: String): List<Song>{
    if(texts.isEmpty()){
        return emptyList()
    }
    else {
        return listOfSongs.filter { it.title.contains(texts,ignoreCase = true) }
    }


}