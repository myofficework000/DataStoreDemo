package com.code4galaxy.datastore.domain.model

data class UserPreferences(
    val showCompleted: Boolean,
    val showPending: Boolean,
    val sortOrder: SortOrder,
)