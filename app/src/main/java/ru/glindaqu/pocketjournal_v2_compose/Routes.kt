package ru.glindaqu.pocketjournal_v2_compose

import ru.glindaqu.pocketjournal_v2_compose.dataModels.BottomBarItemData

interface RoutesI {
    val destinations: List<BottomBarItemData>
        get() = listOf(
            BottomBarItemData(R.string.dest_home, R.drawable.home, "home"),
            BottomBarItemData(R.string.dest_journal, R.drawable.journal, "journal"),
            BottomBarItemData(R.string.dest_omissions, R.drawable.omissions, "omissions"),
            BottomBarItemData(R.string.dest_settings, R.drawable.settings, "settings"),
        )
}