package com.heroes.ui.application_flow.dashboard.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.heroes.core.ui.shimmering.DefaultHeroesShimmering
import com.valentinilk.shimmer.shimmer

@Composable
fun DashboardScreenLoadingState() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .shimmer(DefaultHeroesShimmering())
    ) {
        LazyColumn {
            items(20) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.Gray),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(
                        modifier = Modifier
                            .height(20.dp)
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun DashboardScreenLoadingStatePreview() {
    DashboardScreenLoadingState()
}