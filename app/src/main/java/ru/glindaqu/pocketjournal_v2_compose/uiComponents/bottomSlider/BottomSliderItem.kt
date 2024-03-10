package ru.glindaqu.pocketjournal_v2_compose.uiComponents.bottomSlider

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.glindaqu.pocketjournal_v2_compose.DEFAULT_CARD_ELEVATION
import ru.glindaqu.pocketjournal_v2_compose.ui.theme.UbuntuMono


@Composable
fun BottomSliderItem(textSrc: Int, painterSrc: Int, onClick: () -> Unit) {
    Card(
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.onBackground),
        elevation = CardDefaults.cardElevation(DEFAULT_CARD_ELEVATION),
        modifier = Modifier
            .padding(
                horizontal = 15.dp
            )
    ) {
        Row(
            modifier = Modifier
                .clickable {
                    onClick()
                }
                .height(60.dp)
                .padding(
                    horizontal = 20.dp,
                    vertical = 10.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = stringResource(
                    id = textSrc
                ),
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = UbuntuMono,
                fontSize = 16.sp
            )
            Icon(
                painter = painterResource(id = painterSrc),
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier
                    .padding(
                        start = 10.dp
                    )
                    .size(24.dp)
            )
        }
    }
}
