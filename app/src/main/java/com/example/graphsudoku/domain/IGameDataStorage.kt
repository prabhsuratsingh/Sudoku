package com.example.graphsudoku.domain

import java.lang.Exception

interface IGameDataStorage {
    suspend fun updateGame(game: SudokuPuzzle) : GameStorageResult
    suspend fun getCurrentGame() : GameStorageResult
    suspend fun updateNode(x: Int, y: Int, color: Int, elapsedTime: Long): GameStorageResult
}

sealed class GameStorageResult {
    data class OnSuccess(val currentGame: SudokuPuzzle) : GameStorageResult()
    data class OnError(val exception: Exception) : GameStorageResult()
}