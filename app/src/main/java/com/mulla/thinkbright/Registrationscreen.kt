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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mulla.thinkbright.ui.theme.Lightblue

@Composable
fun Register(navController: NavController){
    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 20.dp)
        
    ) {
        Text(text = "Hey there,",
            color = Color.Black,
            fontSize = 18.sp)

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn()

        ) {
            Text(text = "Create an Account",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                color = Color.Black,
                fontSize = 28.sp)

        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = name, 
            onValueChange = {name = it},
            leadingIcon =  { Icon(imageVector = Icons.Default.Person, contentDescription = "Icon") },
            label = { Text(text = "Enter name",
                color = Color.Black,
                fontSize = 20.sp)
            },
                    modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = email, onValueChange = {email = it},
            leadingIcon =  { Icon(imageVector = Icons.Default.Email, contentDescription = "Icon") },
            label = { Text(text = "Enter email",
                color = Color.Black,
                fontSize = 20.sp)
            },
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = password, onValueChange = {password = it},
            leadingIcon =  { Icon(imageVector = Icons.Default.Lock, contentDescription = "Icon") },
            label = { Text(text = "Enter password",
                color = Color.Black,
                fontSize = 20.sp)

            },
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/
        },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Transparent)) {
            Text(text = "Register",
                textAlign = TextAlign.Center,
                fontSize = 23.sp,
                lineHeight = 2.5.em,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(48.dp)
                    .background(
                        brush = Brush.horizontalGradient(listOf(Blue, Lightblue)),
                        shape = RoundedCornerShape(50.dp)
                    )
            )
    }

    }}

@Preview
@Composable
private fun Regpre() {
    Register(navController = rememberNavController())
}