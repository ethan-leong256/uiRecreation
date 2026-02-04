package com.example.recreateuicis357

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recreateuicis357.ui.theme.RecreateUICIS357Theme
import com.example.recreateuicis357.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecreateUICIS357Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun uiRecreation(modifier: Modifier = Modifier) {
    val options = listOf("Light Mode", "Dark Mode")
    var selectedOption by remember { mutableStateOf(options[0]) }
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier.fillMaxSize() ) {
        Row(horizontalArrangement = Arrangement.Start) {
            Image(
                painter = painterResource(id = R.drawable.user_profile),
                contentDescription = "User Profile"
            )
            Column() {
                Text("Ethan Leong", modifier = modifier, fontSize = 30.sp)
                Text("Create a channel >")
            }
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth(fraction = 1f)) {
            Button(onClick = {}) {
                Text("Switch account")
            }
            Button(onClick = {}) {
                Text("Google Account")
            }
        }

        Row(horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier.fillMaxWidth()) {
            Text("Playlists", fontSize = 25.sp)
            Spacer(modifier = Modifier.weight(1f))
            Text("+ ", fontSize = 45.sp)
            Button(onClick = {} ) {
                Text("View All")
            }
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(fraction = 1f)) {
            Column()
            {
                Image(
                    painter = painterResource(id = R.drawable.minnow),
                    contentDescription = "User Profile",
                    modifier = Modifier
                        .size(125.dp)
                )
                Text("Watch Later")
                Text("Private", fontSize = 10.sp)
            }
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.salmon),
                    contentDescription = "User Profile",
                    modifier = Modifier
                        .size(125.dp)
                )
                Text("Liked Videos")
                Text("Private", fontSize = 10.sp)
            }
            Image(
                painter = painterResource(id = R.drawable.smb),
                contentDescription = "User Profile",
                modifier = Modifier
                    .size(125.dp)
            )
        }

        Row(){
            Column() {
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.play_button),
                        contentDescription = "User Profile",
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Text("Your Videos")
                }
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.clapper),
                        contentDescription = "User Profile",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Text("Movies and TV")
                }
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth(fraction = 1f)){
            options.forEach { option ->
                Row() {
                    RadioButton(
                        selectedOption == option,
                        onClick = { selectedOption = option }
                    )
                    Text(text = option)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RecreateUICIS357Theme {
        uiRecreation()
    }
}