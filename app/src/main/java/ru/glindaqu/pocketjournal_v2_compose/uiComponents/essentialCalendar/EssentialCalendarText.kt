package ru.glindaqu.pocketjournal_v2_compose.uiComponents.essentialCalendar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.glindaqu.pocketjournal_v2_compose.ui.theme.UbuntuMono

@Composable
fun EssentialCalendarText(it: String, color: Color = Color.Black) {
    Text(
        text = it,
        fontFamily = UbuntuMono,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        color = color,
        modifier = Modifier
            .padding(2.dp)
    )
}