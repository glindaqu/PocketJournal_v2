package ru.glindaqu.pocketjournal_v2_compose.uiComponents.essentialCalendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EssentialCalendarNumberItem(text: String, isSelected: Boolean) {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .size(25.dp)
            .background(
                color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Transparent,
                shape = RoundedCornerShape(15.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        EssentialCalendarText(
            it = text,
            color = if (isSelected) Color.White else Color.Black
        )
    }
}