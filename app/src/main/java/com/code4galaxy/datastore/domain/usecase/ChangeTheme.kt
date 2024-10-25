package com.code4galaxy.datastore.domain.usecase

import com.code4galaxy.datastore.domain.repo.UserPreferencesRepository

class ChangeTheme(private val userPreferencesRepository: UserPreferencesRepository) {
    suspend operator fun invoke(lightTheme: Boolean) =
        userPreferencesRepository.changeTheme(lightTheme)
}