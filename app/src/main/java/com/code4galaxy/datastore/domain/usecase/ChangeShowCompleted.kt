package com.code4galaxy.datastore.domain.usecase

import com.code4galaxy.datastore.domain.repo.UserPreferencesRepository

class ChangeShowCompleted(
    private val userPreferencesRepository: UserPreferencesRepository,
) {
    suspend operator fun invoke(showCompleted: Boolean) =
        userPreferencesRepository.updateShowCompleted(showCompleted)
}