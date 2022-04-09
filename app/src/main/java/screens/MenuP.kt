package screens

import Navigation.AppScreens
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Menu(navcontroller: NavController){
    Scaffold() {
    }
    BodyMenu(navcontroller)
}
@Composable
fun BodyMenu(navcontroller: NavController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly) {
        Button(onClick = {navcontroller.navigate(route = AppScreens.Registro.route)}
            , modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(120.dp)
                .padding(20.dp)) {
            Text(text = "Registro")
        }
        Button(onClick = {navcontroller.navigate(route = AppScreens.Informes.route)}
            , modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .height(120.dp)
                .padding(20.dp)
                .fillMaxWidth()) {
            Text(text = "Informes")
        }
    }
}