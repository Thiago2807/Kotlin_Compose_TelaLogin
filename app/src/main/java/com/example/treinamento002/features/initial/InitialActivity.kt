package com.example.treinamento002.features.initial

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.treinamento002.R
import com.example.treinamento002.domain.App
import com.example.treinamento002.features.initial.ui.theme.Treinamento002Theme
import com.example.treinamento002.ui.theme.BlueColor
import com.example.treinamento002.ui.theme.BlueSecondaryColor

class InitialActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Treinamento002Theme {
                InitialScreen();
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InitialScreen() {
    val viewModelInitial = App.LocalModelViewInitial.current;

    val stateScreen by viewModelInitial.textMsg.collectAsState();

    val msgScreen = stringResource(id = R.string.Welcome);

    Scaffold()
    {
        Box(
            modifier = Modifier
                .padding(it)
                .background(color = BlueSecondaryColor)
        )
        {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = stateScreen, modifier = Modifier.padding(vertical = 32.dp))
                Button(
                    onClick = {
                        viewModelInitial.alterMsg(msgScreen)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)

                ) {
                    Text(text = "Alter Text")
                }
            }
        }
    }
}
