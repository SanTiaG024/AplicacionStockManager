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
fun Informes(navcontroller: NavController)
{
    Scaffold() {
        TopAppBar(
            title = { Text(text = "Informes") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
        )
        BodyInformes(navcontroller)
    }
}
@Composable
fun BodyInformes(navcontroller: NavController){
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.padding(top = 40.dp).fillMaxSize(1f)) {
        Button(onClick = {navcontroller.navigate(route = AppScreens.InformeRegistrosIO.route)}
            , modifier = Modifier
                // .align(alignment = Alignment.CenterHorizontally)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(20.dp)
                .fillMaxWidth()) {
            Text(text = "Compras y Salidas")
        }
        Button(onClick = {}
            , modifier = Modifier
                //.align(alignment = Alignment.CenterHorizontally)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(20.dp)
                .fillMaxWidth()
            //.fillMaxWidth()
        ) {
            Text(text = "Existencias Minimas")
        }
        Button(onClick = {navcontroller.navigate(route = AppScreens.InformeRegistrosProducto.route)}
            , modifier = Modifier
                // .align(alignment = Alignment.CenterHorizontally)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(20.dp)
                .fillMaxWidth()
            //.fillMaxWidth()
        ) {
            Text(text = "Producto")
        }
        Button(onClick = {navcontroller.navigate(route = AppScreens.InformeRegistrosMarca.route)}
            , modifier = Modifier
                //.align(alignment = Alignment.CenterHorizontally)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(20.dp)
                .fillMaxWidth()
            //.fillMaxWidth()
        ) {
            Text(text = "Marcas")
        }
        Button(onClick = {navcontroller.navigate(route = AppScreens.InformeRegistrosProveedores.route)}
            , modifier = Modifier
                // .align(alignment = Alignment.CenterHorizontally)
                .align(alignment = Alignment.CenterHorizontally)
                .padding(20.dp)
                .fillMaxWidth()
            //.fillMaxWidth()
        ) {
            Text(text = "Proveedores")
        }
    }
}