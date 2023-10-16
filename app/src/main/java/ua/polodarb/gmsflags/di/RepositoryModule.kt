package ua.polodarb.gmsflags.di

import org.koin.dsl.module
import ua.polodarb.gmsflags.data.repo.AppsListRepository
import ua.polodarb.gmsflags.data.repo.GmsDBRepository
import ua.polodarb.gmsflags.data.repo.RoomDBRepository
import ua.polodarb.gmsflags.data.repo.SettingsRepository

val repositoryModule = module {

    single {
        GmsDBRepository(
            context = get()
        )
    }

    single {
        AppsListRepository(
            context = get()
        )
    }

    single {
        RoomDBRepository(
            savedPackagesDao = get(),
            savedFlagsDao = get()
        )
    }

    single {
        SettingsRepository(
            context = get(),
            flagsDao = get(),
            packagesDAO = get()
        )
    }

}