package ru.glindaqu.pocketjournal_v2_compose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.glindaqu.pocketjournal_v2_compose.DEFAULT_HORIZONTAL_PADDING
import ru.glindaqu.pocketjournal_v2_compose.uiComponents.TimeWidget
import ru.glindaqu.pocketjournal_v2_compose.uiComponents.TopDatePicker
import ru.glindaqu.pocketjournal_v2_compose.uiComponents.essentialCalendar.EssentialCalendar
import ru.glindaqu.pocketjournal_v2_compose.uiComponents.quickOptions.QuickOptionsList
import java.util.Date

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = DEFAULT_HORIZONTAL_PADDING
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // TODO: implement date as a state? journal view has using this by default
        TopDatePicker(currentDate = Date()) {
        }
        EssentialCalendar()
        // TODO: check if there is a memory leak
        TimeWidget()
        QuickOptionsList()
    }
}