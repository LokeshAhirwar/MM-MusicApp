package com.example.mm_music.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mm_music.Data.listOfBottomIcon

@Preview(showSystemUi = true)
@Composable
fun mainScreen(){
    var selected by remember { mutableStateOf(0) }
    Scaffold(modifier = Modifier.fillMaxSize()
        , topBar = { TopAppBarFun() }
    , bottomBar = {
            NavigationBar(
                //the below is for transparent background
//                containerColor = NavigationBarDefaults.containerColor.copy(alpha = 0f)
            ) {
                val navcronller = rememberNavController()
                listOfBottomIcon.forEachIndexed {
                        index, item ->
                    NavigationBarItem(selected = selected == index,
                        onClick = { selected = index },
                        label = { Text(item.title) },
                        icon = {
                            Icon(imageVector = if(index==selected) item.selected else item.unSelected, contentDescription = "Icon")
                        })
                }
            }
    }
    , containerColor = MaterialTheme.colorScheme.background.copy(alpha = 0f)) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding).fillMaxSize())
       navigateTo(modifier = Modifier.padding(innerPadding),selected)
    }

}
@Composable
fun navigateTo(modifier: Modifier,index: Int){
    when(index){
        0-> homeScreen(modifier = modifier)
        1-> playerScreen(modifier = modifier)
        2-> searchScreen(modifier = modifier)

    }
}