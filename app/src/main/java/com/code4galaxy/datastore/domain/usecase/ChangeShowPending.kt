package com.code4galaxy.datastore.domain.usecase

import com.code4galaxy.datastore.domain.repo.UserPreferencesRepository

class ChangeShowPending(
    private val userPreferencesRepository: UserPreferencesRepository
) {
    suspend operator fun invoke(showPending: Boolean) =
        userPreferencesRepository.updateShowPending(showPending)
}