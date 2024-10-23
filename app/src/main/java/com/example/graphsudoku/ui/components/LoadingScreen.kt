package com.example.graphsudoku.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.graphsudoku.R
import com.example.graphsudoku.ui.lightGrey
import com.example.graphsudoku.ui.mainTitle

@Composable
fun LoadingScreen() {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .fillMaxHeight(0.8f)
            .fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                modifier = Modifier.size(128.dp),
                contentDescription = stringResource(R.string.logo_description)
            )

            LinearProgressIndicator(
                color = lightGrey,
                modifier = Modifier
                    .size(128.dp)
                    .padding(16.dp)
            )

            Text(
                text = stringResource(R.string.loading),
                style = mainTitle.copy(color = MaterialTheme.colorScheme.secondary),
                modifier = Modifier.wrapContentSize()
            )
        }
    }
}