package com.mulla.thinkbright

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Homescreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn()
                .offset(0.dp, 90.dp)

        ) {
            Text(text = "THINK BRIGHT",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                color = Color.Black,
                fontSize = 28.sp)

        }
        ExtendedFloatingActionButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .offset(80.dp, 450.dp)
                .padding(70.dp)) {
            IconButton(onClick = { Log.d("Click", "IconExample")}) {
                Icon(
                    painterResource(id = R.drawable.iconic),
                    contentDescription = "Home Icon",
                    modifier = Modifier.clickable {  Log.d("Click", "IconExample")})
            }

        }
    }
}

@Preview
@Composable
private fun Homepre() {
    Homescreen(navController = rememberNavController())
}