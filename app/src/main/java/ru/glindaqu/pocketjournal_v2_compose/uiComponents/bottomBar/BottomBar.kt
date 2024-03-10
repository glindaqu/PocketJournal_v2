package ru.glindaqu.pocketjournal_v2_compose.uiComponents.bottomBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import ru.glindaqu.pocketjournal_v2_compose.DEFAULT_CARD_ELEVATION
import ru.glindaqu.pocketjournal_v2_compose.dataModels.BottomBarItemData
import ru.glindaqu.pocketjournal_v2_compose.uiComponents.bottomSlider.BottomSlider

@Composable
fun BottomBar(destinations: List<BottomBarItemData>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .graphicsLayer {
                clip = true
                shape = RoundedCornerShape(
                    topStart = 15.dp,
                    topEnd = 15.dp
                )
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BottomSlider()
        NavigationBar(
            tonalElevation = DEFAULT_CARD_ELEVATION,
            containerColor = MaterialTheme.colorScheme.onBackground
        ) {
            destinations.forEach { el ->
                BottomBarItemView(
                    itemData = el,
                    selected = false
                )
            }
        }
    }
}