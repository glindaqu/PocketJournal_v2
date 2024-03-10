package ru.glindaqu.pocketjournal_v2_compose.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

//private val DarkColorScheme = darkColorScheme(
//    primary = Purple80,
//    secondary = PurpleGrey80,
//    tertiary = Pink80
//)
//
//private val LightColorScheme = lightColorScheme(
//    primary = Purple40,
//    secondary = PurpleGrey40,
//    tertiary = Pink40,
//    background = Color(0xFFF7E3E4)
//    /* Other default colors to override
//    background = Color(0xFFFFFBFE),
//    surface = Color(0xFFFFFBFE),
//    onPrimary = Color.White,
//    onSecondary = Color.White,
//    onTertiary = Color.White,
//    onBackground = Color(0xFF1C1B1F),
//    onSurface = Color(0xFF1C1B1F),
//    */
//)

private val MainPalette = lightColorScheme(
    background = Color(0xFFF7E3E4),
    primary = Color(0xFFAD696B),
    onBackground = Color.White
)

@Composable
fun PocketJournal_v2_ComposeTheme(
    content: @Composable () -> Unit
) {
    val systemUIController = rememberSystemUiController()

    SideEffect {
        systemUIController.setStatusBarColor(MainPalette.background)
        systemUIController.setNavigationBarColor(MainPalette.onBackground)
    }

    MaterialTheme(
        colorScheme = MainPalette,
        typography = Typography,
        content = content
    )
}