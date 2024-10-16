package com.example.graphsudoku.domain

import java.lang.Exception

interface ISettingsStorage {
    suspend fun getSettings() : SettingsStorageResult
    suspend fun updateSettings(settings: Settings) : SettingsStorageResult
}

sealed class SettingsStorageResult {
    data class OnSuccess(val settings: Settings) : SettingsStorageResult()
    data class OnError(val exception: Exception) : SettingsStorageResult()
}