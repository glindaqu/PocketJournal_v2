package ru.glindaqu.pocketjournal_v2_compose.uiComponents

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ru.glindaqu.pocketjournal_v2_compose.date.monthAndDay
import ru.glindaqu.pocketjournal_v2_compose.ui.theme.UbuntuMono
import java.util.Date

@Composable
fun TopDatePicker(currentDate: Date, onDateSelection: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = monthAndDay.format(currentDate),
            fontFamily = UbuntuMono,
            fontSize = 20.sp,
            color = Color.Black
        )
        IconButton(
            onClick = {
                onDateSelection()
            },
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                tint = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopDatePicker_Test() {
    TopDatePicker(Date()) {}
}