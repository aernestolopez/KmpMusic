package org.example.kmpmusic.ui.screens.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import kmpmusic.shared.generated.resources.Res
import kmpmusic.shared.generated.resources.back
import org.example.kmpmusic.musics
import org.example.kmpmusic.ui.screens.Screen
import org.jetbrains.compose.resources.stringResource

@Composable
fun DetailScreen(){
    val music = musics[0]
    Screen {
        Scaffold (
            topBar = {
                TopAppBar(
                    title = {Text(music.title)},
                    navigationIcon = {
                        IconButton(onClick ={ /*ToDo*/}){
                            Icon(
                                imageVector = Icons.AutoMirrored.Default.ArrowBack,
                                contentDescription = stringResource(Res.string.back)
                            )
                        }
                    }
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .verticalScroll(rememberScrollState())
            ) {
                AsyncImage(
                    model = music.cover,
                    contentDescription = music.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16 / 9f)
                )
                Text(
                    music.title,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }
    }
}