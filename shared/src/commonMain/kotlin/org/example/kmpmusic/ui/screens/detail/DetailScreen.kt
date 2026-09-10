package org.example.kmpmusic.ui.screens.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.example.kmpmusic.musics
import org.example.kmpmusic.ui.screens.Screen

@Composable
fun DetailScreen(){
    val music = musics[0]
    Screen {
        Scaffold { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                Text(music.title)
            }
        }
    }
}