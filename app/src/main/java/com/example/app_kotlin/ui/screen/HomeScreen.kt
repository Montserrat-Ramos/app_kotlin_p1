package com.example.app_kotlin.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

@Composable
fun HomeScreen(){
    Column(
        //DEfiniar alineamiento y contorno o padding de la columna
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //Textos
        Text(text = "Inicio")
        //Espacios
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Bienvenido a mi aplicación")
        Spacer(modifier = Modifier.height(20.dp))

        Button( onClick = {
            ///No se le agrega una función
        }) { Text(text = "Aceptar")}
    }

}
