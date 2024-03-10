package ru.glindaqu.pocketjournal_v2_compose.uiComponents.essentialCalendar

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.glindaqu.pocketjournal_v2_compose.DEFAULT_CARD_ELEVATION
import ru.glindaqu.pocketjournal_v2_compose.DEFAULT_HORIZONTAL_PADDING
import ru.glindaqu.pocketjournal_v2_compose.R
import ru.glindaqu.pocketjournal_v2_compose.date.dayOnly
import java.time.LocalDate
import java.util.Date

@Composable
fun EssentialCalendar() {

    val weekdayTitles = listOf(
        R.string.essential_calendar_mon, R.string.essential_calendar_tue,
        R.string.essential_calendar_wed, R.string.essential_calendar_tue,
        R.string.essential_calendar_fri, R.string.essential_calendar_sat,
        R.string.essential_calendar_sun
    )
    val currentDay = dayOnly.format(Date()).toInt()
    val month = LocalDate.now().month
    val dayOffset = LocalDate.of(LocalDate.now().year, month, 1).dayOfWeek.value

    // need 7 rows and 4 cols
    Card(
        elevation = CardDefaults.cardElevation(DEFAULT_CARD_ELEVATION),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onBackground,
        ),
        modifier = Modifier
            .padding(
                top = 20.dp
            )
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            // titles
            LazyVerticalGrid(
                columns = GridCells.Fixed(7),
                modifier = Modifier
                    .padding(
                        vertical = 5.dp
                    )
            ) {
                items(weekdayTitles) {
                    EssentialCalendarText(
                        it = stringResource(
                            id = it
                        )
                    )
                }
            }
            // line-breaker
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 5.dp
                    )
                    .padding(
                        bottom = 3.dp
                    )
                    .height(0.5.dp)
                    .background(Color.Black)
            )
            // numbers
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(7),
                verticalItemSpacing = 10.dp,
                modifier = Modifier
                    .padding(
                        vertical = 5.dp
                    )
            ) {
                // placeholders for unused days
                items((1..<dayOffset).toList()) {
                    Text("")
                }
                items((1.. month.length(true)).toList()) {
                    EssentialCalendarNumberItem(
                        text = it.toString(),
                        isSelected = it == currentDay
                     )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EssentialCalendar_Test() {
    EssentialCalendar()
}