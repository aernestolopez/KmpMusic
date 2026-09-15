package org.example.kmpmusic.ui.screens.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.example.kmpmusic.Music
import org.example.kmpmusic.musics
import kotlin.time.Duration.Companion.milliseconds

class HomeViewModel : ViewModel() {

    var state by mutableStateOf(UiState())
        private set
    init {
        viewModelScope.launch {
            state = UiState(loading = true)
            delay(1000.milliseconds)
            state = UiState(loading = false, musics = musics)
        }
    }

    data class UiState(
        val loading : Boolean = false,
        val musics: List<Music> = emptyList()
    )
}