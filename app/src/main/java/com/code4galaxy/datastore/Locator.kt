package com.code4galaxy.datastore

import android.app.Application
import android.content.Context
import androidx.datastore.preferences.preferencesDataStore
import com.code4galaxy.datastore.data.TaskRepositoryImpl
import com.code4galaxy.datastore.data.UserPreferencesRepositoryImpl
import com.code4galaxy.datastore.domain.usecase.ChangeShowCompleted
import com.code4galaxy.datastore.domain.usecase.ChangeTheme
import com.code4galaxy.datastore.domain.usecase.EnableSortByDeadline
import com.code4galaxy.datastore.domain.usecase.EnableSortByPriority
import com.code4galaxy.datastore.domain.usecase.FilterSortTasks
import com.code4galaxy.datastore.domain.usecase.GetTheme
import com.code4galaxy.datastore.ui.MainViewModel

object Locator {
    private var application: Application? = null

    private inline val requireApplication
        get() = application ?: error("Missing call: initWith(application)")

    fun initWith(application: Application) {
        this.application = application
    }

    val mainViewModelFactory
        get() = MainViewModel.Factory(
            filterSortTasks = filterSortTasks,
            getTheme = getTheme,
            changeShowCompleted = changeShowCompleted,
            enableSortByDeadline = enableSortByDeadline,
            enableSortByPriority = enableSortByPriority,
            changeTheme = changeTheme,
        )

    private val filterSortTasks
        get() = FilterSortTasks(
            taskRepository = taskRepository,
            userPreferencesRepository = userPreferencesRepository
        )

    private val changeTheme get() = ChangeTheme(userPreferencesRepository)

    private val getTheme get() = GetTheme(userPreferencesRepository)

    private val changeShowCompleted get() = ChangeShowCompleted(userPreferencesRepository)

    private val enableSortByDeadline get() = EnableSortByDeadline(userPreferencesRepository)

    private val enableSortByPriority get() = EnableSortByPriority(userPreferencesRepository)

    private val Context.dataStore by preferencesDataStore(name = "user_preferences")

    private val taskRepository by lazy { TaskRepositoryImpl() }
    private val userPreferencesRepository by lazy {
        UserPreferencesRepositoryImpl(requireApplication.dataStore)
    }
}