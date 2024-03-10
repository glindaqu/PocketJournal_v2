package ru.glindaqu.pocketjournal_v2_compose.presenters.implementation

import ru.glindaqu.pocketjournal_v2_compose.RoutesI
import ru.glindaqu.pocketjournal_v2_compose.presenters.interfaces.HomePresenterI
import java.util.Date

class HomePresenter : HomePresenterI, RoutesI {
    override fun getCurrentDate(): Date {
        return Date()
    }
}