package com.cirilobido.focustimeryt.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.cirilobido.focustimeryt.presentation.theme.FocusTimerYTTheme

@Composable
fun AutoResizedText(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = MaterialTheme.typography.displayLarge,
) {
    var timeTextStyle by remember { mutableStateOf(textStyle) }
    val fontSizeFactor = 0.95
    Text(
        text,
        modifier = modifier.fillMaxWidth(),
        softWrap = false,
        style = timeTextStyle,
        onTextLayout = { result ->
            if (result.didOverflowWidth) {
                timeTextStyle = timeTextStyle.copy(
                    fontSize = timeTextStyle.fontSize * fontSizeFactor
                )
            }
        }
    )
}

// 1-Preview Annotation
@Preview(
    name = "AutoResizedTextPreview",
    showBackground = true,
)
// 2- Composable for the preview
@Composable
fun AutoResizedTextPreview() {
//    3-Theme
    FocusTimerYTTheme {
//        4-Composable to preview
        AutoResizedText(
            text = "Focus Timer"
        )
    }
}