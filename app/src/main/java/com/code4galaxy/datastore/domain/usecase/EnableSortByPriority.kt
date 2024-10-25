package com.code4galaxy.datastore.domain.usecase

import com.code4galaxy.datastore.domain.repo.UserPreferencesRepository

class EnableSortByPriority(private val userPreferencesRepository: UserPreferencesRepository) {
    suspend operator fun invoke(enabled: Boolean) =
        userPreferencesRepository.enableSortByPriority(enabled)
}