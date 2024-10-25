package com.code4galaxy.datastore.domain.repo

import com.code4galaxy.datastore.domain.model.Theme
import com.code4galaxy.datastore.domain.model.UserPreferences
import kotlinx.coroutines.flow.Flow

interface UserPreferencesRepository {
    val userPreferences: Flow<UserPreferences>

    suspend fun enableSortByDeadline(enabled: Boolean)

    suspend fun enableSortByPriority(enabled: Boolean)

    suspend fun updateShowCompleted(showCompleted: Boolean)

    suspend fun changeTheme(lightTheme: Boolean)

    val theme: Flow<Theme>
}