package com.example.graphsudoku.ui.activegame

import com.example.graphsudoku.domain.Difficulty
import com.example.graphsudoku.domain.SudokuPuzzle

class ActiveGameViewModel {
    internal val subBoardState: ((HashMap<Int, SudokuTile>) -> Unit)? = null
    internal val subContentState: ((ActiveGameScreenState) -> Unit)? = null
    internal val subTimerState: ((Long) -> Unit)? = null

    internal fun updateTimerState() {
        timerState++
        subTimerState?.invoke(timerState)
    }

    internal var subIsCompleteState: ((Boolean) -> Unit)? = null

    internal var timerState: Long = 0L

    internal var difficulty = Difficulty.MEDIUM
    internal var boundary = 9
    internal var boardState: HashMap<Int, SudokuTile> = HashMap()

    internal var isCompleteState: Boolean = false
    internal var isNewRecordState: Boolean = false

    fun initializeBoardState(
        puzzle: SudokuPuzzle,
        isComplete: Boolean
    ) {
        puzzle.graph.forEach {
            val node = it.value[0]
            boardState[it.key] = SudokuTile(
                node.x,
                node.y,
                node.color,
                hasFocus = false,
                node.readOnly
            )
        }

        val contentState: ActiveGameScreenState

        if(isComplete) {
            isCompleteState = true
            contentState = ActiveGameContentState.COMPLETE
        } else {
            contentState = ActiveGameContentState.ACTIVE
        }

        boundary = puzzle.boundary
        difficulty = puzzle.difficulty
        timerState = puzzle.elapsedTime

        subIsCompleteState?.invoke(isCompleteState)
        subContentState?.invoke(contentState)
        subBoardState?.invoke(boardState)
    }
}

class SudokuTile(
    val x: Int,
    val y: Int,
    var value: Int,
    var hasFocus: Boolean,
    var readOnly: Boolean
)