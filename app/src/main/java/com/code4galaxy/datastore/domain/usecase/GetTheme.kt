package com.code4galaxy.datastore.domain.usecase

import com.code4galaxy.datastore.domain.model.Theme
import com.code4galaxy.datastore.domain.repo.UserPreferencesRepository
import kotlinx.coroutines.flow.Flow

class GetTheme(private val userPreferencesRepository: UserPreferencesRepository) {
    operator fun invoke(): Flow<Theme> = userPreferencesRepository.theme
}