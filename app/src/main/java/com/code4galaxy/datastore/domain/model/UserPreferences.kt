package com.code4galaxy.datastore.domain.model

data class UserPreferences(
    val showCompleted: Boolean,
    val sortOrder: SortOrder,
)