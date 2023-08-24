package com.datdroid.timer.ui.widget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.datdroid.timer.R

@Composable
fun HorizontalNumberScroller() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_up),
            contentDescription = stringResource(id = R.string.content_desc_ic_up),
            modifier = Modifier
                .clickable { /* TODO: handle click */ }
                .size(dimensionResource(id = R.dimen.ic_size))
        )

        Text(
            text = "9",
            style = MaterialTheme.typography.h1.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 96.sp
            )
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_down),
            contentDescription = stringResource(id = R.string.content_desc_ic_down),
            modifier = Modifier
                .clickable { /* TODO: handle click */ }
                .size(dimensionResource(id = R.dimen.ic_size))
        )
    }
}
