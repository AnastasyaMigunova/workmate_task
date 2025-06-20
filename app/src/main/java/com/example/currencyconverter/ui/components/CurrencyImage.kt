package com.example.currencyconverter.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.currencyconverter.R

@Composable
fun CurrencyImage(
    modifier: Modifier = Modifier,
    image: String
) {
    AsyncImage(
        model = image,
        contentDescription = "Track Cover",
        modifier = modifier
            .clip(RoundedCornerShape(4.dp)),
        error = painterResource(R.drawable.ic_default_currency)
    )
}