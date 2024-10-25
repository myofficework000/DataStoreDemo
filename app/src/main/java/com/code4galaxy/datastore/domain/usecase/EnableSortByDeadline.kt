package com.code4galaxy.datastore.domain.usecase

import com.code4galaxy.datastore.domain.repo.UserPreferencesRepository

class EnableSortByDeadline(
    private val userPreferencesRepository: UserPreferencesRepository,
) {
    suspend operator fun invoke(enabled: Boolean) =
        userPreferencesRepository.enableSortByDeadline(enabled)
}