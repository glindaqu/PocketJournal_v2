package ru.glindaqu.pocketjournal_v2_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import ru.glindaqu.pocketjournal_v2_compose.presenters.implementation.HomePresenter
import ru.glindaqu.pocketjournal_v2_compose.screens.Home
import ru.glindaqu.pocketjournal_v2_compose.ui.theme.PocketJournal_v2_ComposeTheme
import ru.glindaqu.pocketjournal_v2_compose.uiComponents.bottomBar.BottomBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()

        val presenter = HomePresenter()

        super.onCreate(savedInstanceState)
        setContent {
            PocketJournal_v2_ComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        bottomBar = {
                            BottomBar(
                                destinations = presenter.destinations
                            )
                        }
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(it)
                        ) {
                            Home()
                        }
                    }
                }
            }
        }
    }
}








