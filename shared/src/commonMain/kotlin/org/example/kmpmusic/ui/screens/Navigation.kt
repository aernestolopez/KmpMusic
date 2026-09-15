package org.example.kmpmusic.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

import kotlinx.serialization.Serializable
import org.example.kmpmusic.musics
import org.example.kmpmusic.ui.screens.detail.DetailScreen
import org.example.kmpmusic.ui.screens.home.HomeScreen

@Serializable
object Home

@Serializable
data class Detail(val musicId: Int)

@Composable
fun Navigation() {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Home) {

        composable<Home> {
            HomeScreen(
                onMusicClick = { music ->
                    navController.navigate(Detail(musicId = music.id))
                }
            )
        }

        composable<Detail> { backStackEntry ->
            val detail: Detail = backStackEntry.toRoute()

            DetailScreen(
                music = musics.first { it.id == detail.musicId },
                onBack = { navController.popBackStack() }
            )
        }
    }
}
