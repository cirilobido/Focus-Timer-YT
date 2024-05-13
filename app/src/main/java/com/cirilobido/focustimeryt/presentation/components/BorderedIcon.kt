package com.cirilobido.focustimeryt.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.cirilobido.focustimeryt.R
import com.cirilobido.focustimeryt.presentation.theme.FocusTimerYTTheme

@Composable
fun BorderedIcon(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    onTap: () -> Unit = {}
) {
    Icon(
        modifier = modifier
            .size(FocusTimerYTTheme.dimens.iconSizeNormal)
            .border(
                width = FocusTimerYTTheme.dimens.borderNormal,
                color = MaterialTheme.colorScheme.primary,
                shape = CircleShape
            )
            .padding(FocusTimerYTTheme.dimens.paddingSmall)
            .clickable { onTap() },
        imageVector = ImageVector.vectorResource(id = icon),
        contentDescription = null,
        tint = MaterialTheme.colorScheme.primary
    )
}

@Preview(
    name = "BorderedIconPreview",
    showBackground = true,
)
@Composable
fun BorderedIconPreview() {
    FocusTimerYTTheme {
        BorderedIcon(
            icon = R.drawable.ic_launcher_background
        )
    }
}