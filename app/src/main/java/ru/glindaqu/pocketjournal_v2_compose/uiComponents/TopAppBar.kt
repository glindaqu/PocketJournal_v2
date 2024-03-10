package ru.glindaqu.pocketjournal_v2_compose.uiComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import java.util.Date

@Composable
fun TopAppBar() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        // TODO: implement date as a state? journal view has using this by default
        TopDatePicker(currentDate = Date()) {
        }
    }
}