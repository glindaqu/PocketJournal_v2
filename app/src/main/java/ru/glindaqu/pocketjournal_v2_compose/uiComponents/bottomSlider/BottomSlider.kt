package ru.glindaqu.pocketjournal_v2_compose.uiComponents.bottomSlider

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.glindaqu.pocketjournal_v2_compose.R

@Composable
fun BottomSlider() {

    val lazyRowState = rememberLazyListState(
        initialFirstVisibleItemScrollOffset = 300
    )

    LazyRow(
        state = lazyRowState,
        modifier = Modifier
            .padding(
                vertical = 15.dp
            )
    ) {
        item {
            BottomSliderItem(textSrc = R.string.bot_bar_slider_students, painterSrc = R.drawable.peoples) {
            }
        }
        item {
            BottomSliderItem(textSrc = R.string.bot_bar_slider_subjects, painterSrc = R.drawable.subjects) {
            }
        }
        item {
            BottomSliderItem(textSrc = R.string.bot_bar_slider_settings, painterSrc = R.drawable.settings) {
            }
        }
    }
}