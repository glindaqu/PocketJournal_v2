package ru.glindaqu.pocketjournal_v2_compose.uiComponents

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ru.glindaqu.pocketjournal_v2_compose.date.hoursAndMinutes
import ru.glindaqu.pocketjournal_v2_compose.ui.theme.UbuntuMono
import java.util.Date

@Composable
fun TimeWidget() {
    var timeState by remember {
        mutableStateOf(hoursAndMinutes.format(Date()))
    }
    lateinit var timerRunner: Runnable
    val handler = Handler(Looper.getMainLooper())

    timerRunner = Runnable {
        timeState = hoursAndMinutes.format(Date())
        handler.postDelayed(timerRunner, 1_000)
    }

    Text(
        text = timeState,
        fontFamily = UbuntuMono,
        fontSize = 40.sp,
        color = Color.Black,
        textAlign = TextAlign.Start,
        modifier = Modifier
            .fillMaxWidth()
    )

    DisposableEffect(Unit) {
        onDispose {
            handler.removeCallbacks(timerRunner)
        }
    }

    handler.postDelayed(timerRunner, 1_000)
}

@Preview(showBackground = true)
@Composable
fun TimeWidget_Test() {
    TimeWidget()
}