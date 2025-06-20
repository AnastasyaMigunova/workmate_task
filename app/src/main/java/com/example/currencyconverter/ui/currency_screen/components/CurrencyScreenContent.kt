package com.example.currencyconverter.ui.currency_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CurrencyScreenContent(
//    isLoading: Boolean,
//    tracks: List<TrackVO>,

) {
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White),
//        verticalArrangement = Arrangement.spacedBy(2.dp)
//    ) {
//        items(tracks) { track ->
//            CustomTrack(
//                cover = track.albumCover,
//                title = track.title,
//                artistName = track.artistName,
//                onClick = { onTrackClick(track.id, playTrackSource) }
//            )
//        }
//    }
}

@Preview
@Composable
fun PreviewCurrencyScreenContent() {
    CurrencyScreenContent()
}