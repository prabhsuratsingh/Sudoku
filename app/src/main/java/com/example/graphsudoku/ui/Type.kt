package com.example.graphsudoku.ui

import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

val typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)

val statsLabel = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Light,
    fontSize = 24.sp,
    textAlign = TextAlign.Center
)

val inputButton = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Black,
    fontSize = 28.sp,
    textAlign = TextAlign.Center
)

val newGameSubtitle = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Light,
    fontSize = 32.sp,
    textAlign = TextAlign.Start
)

val activeGameSubtitle = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 26.sp,
    textAlign = TextAlign.Center
)

val mainTitle = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Light,
    fontSize = 48.sp,
    textAlign = TextAlign.Center
)

fun dropDownText(color: Color) = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Light,
    fontSize = 48.sp,
    textAlign = TextAlign.Center,
    color = color
)

fun readOnlySudokuSquare(tileOffset: Float) = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Light,
    fontSize = (tileOffset * 0.75).sp,
    textAlign = TextAlign.Center,
    color = Color.Black
)

fun mutableSudokuSquare(tileOffset: Float) = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Light,
    fontSize = (tileOffset * 0.75).sp,
    textAlign = TextAlign.Center
)