package com.cirilobido.focustimeryt.presentation.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimens(
    val borderNormal: Dp = 4.dp,
    val buttonHeightNormal: Dp = 56.dp,
    val iconSizeSmall: Dp = 24.dp,
    val iconSizeNormal: Dp = 36.dp,
    val paddingSmall: Dp = 4.dp,
    val paddingNormal: Dp = 8.dp,
    val paddingMedium: Dp = 16.dp,
    val roundedShapeNormal: Dp = 8.dp,
    val spacerSmall: Dp = 4.dp,
    val spacerNormal: Dp = 8.dp,
    val spacerMedium: Dp = 16.dp,
    val spacerLarge: Dp = 40.dp,
)

val DefaultDimens = Dimens()

val TabletDimens = Dimens(
    buttonHeightNormal = 64.dp,
    iconSizeSmall = 36.dp,
    iconSizeNormal = 48.dp,
    paddingSmall = 8.dp,
    paddingNormal = 16.dp,
    paddingMedium = 24.dp,
    roundedShapeNormal = 16.dp,
    spacerSmall = 8.dp,
    spacerNormal = 16.dp,
    spacerMedium = 24.dp,
    spacerLarge = 56.dp,
)
