package com.mulla.thinkbright

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mulla.thinkbright.ui.theme.Lightblue

@Composable
fun Login(navController: NavController){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(vertical = 15.dp)
        ) {
            Text(text = "Welcome back",
                color = Color.Black,
                fontSize = 28.sp)


        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = email, onValueChange = {email = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription ="pass" ) },
            label = { Text(text = "Enter password",
                color = Color.Black,
                fontSize = 20.sp)

            },
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(25.dp))
        Button(onClick = { /*TODO*/
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(text = "Login",
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                lineHeight = 47.0.em,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(48.dp)
                    .background(
                        brush = Brush.horizontalGradient(listOf(Color.Blue, Lightblue)),
                        shape = RoundedCornerShape(50.dp)
                    )
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        val annotatedString = buildAnnotatedString {
            append("Don't have an account? ")
            pushStringAnnotation("sign_up", "Sign up")
            withStyle(style = SpanStyle(color = Color.Blue)) {
                append("Sign up")
            }
            pop()
        }
       ClickableText(text = annotatedString, onClick = { offset ->
           annotatedString.getStringAnnotations(tag = "sign_up", start = offset, end = offset)
               .firstOrNull()?.let { annotation ->
                   navigateToDetailsScreen(navController)
               }
})}}
private fun navigateToDetailsScreen(navController: NavController) {
    navController.navigate(ROUTE_REGISTRATION)
}

@Preview
@Composable
private fun Loginpre() {
    Login(navController = rememberNavController())

}