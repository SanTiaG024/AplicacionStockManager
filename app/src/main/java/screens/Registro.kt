package screens

import Navigation.AppScreens
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Registro(navcontroller: NavController)
{
    Scaffold() {
        TopAppBar(
            title = { Text(text = "Registros") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyRegistro(navcontroller)

    }
}
@Composable
fun BodyRegistro(navcontroller: NavController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(top = 40.dp).fillMaxSize(1f)) {
        Button(
            onClick = {navcontroller.navigate(route = AppScreens.ConsultarP.route) }, modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .fillMaxWidth()
                //.height(110.dp)
                .padding(20.dp)
        ) {
            Text(text = "Consultar Producto")
        }
        Button(onClick = { navcontroller.navigate(route = AppScreens.ResgistrarPro.route) },
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                //.height(110.dp)
                .padding(20.dp)
                .fillMaxWidth()) {
            Text(text = "Registrar Proveedor")
        }
        Button(onClick = { navcontroller.navigate(route = AppScreens.RegistrarP.route) },
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                //.height(110.dp)
                .padding(20.dp)
                .fillMaxWidth()) {
            Text(text = "Registrar Producto")
        }
        Button(
            onClick = {navcontroller.navigate(route = AppScreens.EntradaSalida.route)}, modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .fillMaxWidth()
               // .height(110.dp)
                .padding(20.dp)
        ) {
            Text(text = "Registrar Entrada/Salida")
        }
        Button(
            onClick = {navcontroller.navigate(route = AppScreens.RegistrarMP.route)}, modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(20.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Registrar Marca")
        }

    }
}