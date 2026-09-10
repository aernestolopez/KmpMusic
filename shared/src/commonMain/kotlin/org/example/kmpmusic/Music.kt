package org.example.kmpmusic

data class Music (
    val id: Int,
    val artist: String,
    val duration: String,
    val title: String,
    val cover: String
)

val musics = (1..100).map{
    Music(
        id = it,
        artist = "Artist $it",
        duration = "Duration $it",
        title = "Music $it",
        cover = "https://picsum.photos/200/300?id=$it"
    )
}
