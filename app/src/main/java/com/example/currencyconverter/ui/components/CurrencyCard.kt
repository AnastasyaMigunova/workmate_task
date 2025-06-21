package com.example.currencyconverter.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.currencyconverter.ui.theme.LocalCustomTypography

@Composable
fun CurrencyCard(

    onClick: () -> Unit
) {
    val customTypography = LocalCustomTypography.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(horizontal = 4.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        CurrencyImage(
            modifier = Modifier
                .size(60.dp)
                .padding(start = 8.dp),
            image = ""
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 12.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "USD",
                modifier = Modifier
                    .width(200.dp)
                    .padding(bottom = 8.dp),
                style = customTypography.bigDescription.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = "US dollar",
                modifier = Modifier
                    .padding(bottom = 4.dp),
                style = customTypography.description
            )

            Text(
                text = "Balance",
                style = customTypography.smallDescription
            )
        }
    }

}

@Preview
@Composable
fun PreviewCurrencyCard() {
    CurrencyCard {}
}