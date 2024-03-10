package ru.glindaqu.pocketjournal_v2_compose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.glindaqu.pocketjournal_v2_compose.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val UbuntuMono = FontFamily(
    Font(R.font.ubuntu_mono_regular, FontWeight.Normal),
    Font(R.font.ubuntu_mono_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.ubuntu_mono_bold, FontWeight.Bold),
    Font(R.font.ubuntu_mono_bold_italic, FontWeight.Bold, FontStyle.Italic),
)