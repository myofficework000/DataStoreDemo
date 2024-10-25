package com.code4galaxy.datastore.domain.model

import java.util.*

data class Task(
    val name: String,
    val deadline: Date,
    val priority: TaskPriority,
    val completed: Boolean = false,
)

