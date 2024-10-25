package com.code4galaxy.datastore.domain.repo

import com.code4galaxy.datastore.domain.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun tasks(): Flow<List<Task>>
}