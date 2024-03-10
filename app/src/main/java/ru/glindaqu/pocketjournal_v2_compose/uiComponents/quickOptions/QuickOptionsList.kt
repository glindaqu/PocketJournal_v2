package ru.glindaqu.pocketjournal_v2_compose.uiComponents.quickOptions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.glindaqu.pocketjournal_v2_compose.R


@Composable
fun QuickOptionsList() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        QuickOption(
            title = stringResource(
                id = R.string.quick_option_journal
            )
        ) {
        }
        QuickOption(
            title = stringResource(
                id = R.string.quick_option_omissions
            )
        ) {
        }
        QuickOption(
            title = stringResource(
                id = R.string.quick_option_export_to
            )
        ) {
        }
    }
}