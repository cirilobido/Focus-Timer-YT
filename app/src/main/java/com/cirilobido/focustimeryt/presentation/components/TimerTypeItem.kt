package com.cirilobido.focustimeryt.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.cirilobido.focustimeryt.presentation.theme.FocusTimerYTTheme

@Composable
fun TimerTypeItem(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    onTap: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(FocusTimerYTTheme.dimens.paddingSmall)
            .clickable { onTap() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            style = MaterialTheme.typography.bodyMedium,
            color = textColor
        )
    }
}

@Preview(
    name = "TimerTypeItemPreview",
    showBackground = true,
)
@Composable
fun TimerTypeItemPreview() {
    FocusTimerYTTheme {
        TimerTypeItem(
            text = "Focus",
            textColor = MaterialTheme.colorScheme.primary
        )
    }
}