package screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import mx.up.myapplication.IOProducto
import mx.up.myapplication.Producto
import mx.up.myapplication.RegistroIOViewModel
import mx.up.myapplication.RegistroPViewModel

@Composable
fun InformeRegistrosProducto(navcontroller: NavController){
    Scaffold() {
        val registroPViewModel: RegistroPViewModel = viewModel()
        TopAppBar(
            title = { Text(text = "Informes Productos") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyInformeRegistrosProductos(registroPViewModel.registrosProducto, navcontroller)
    }
}

@Composable
fun BodyInformeRegistrosProductos(listaRegistrosProductos: List<Producto>, navcontroller: NavController)
{
    LazyColumn(modifier = Modifier.fillMaxSize())
    {
        items(items = listaRegistrosProductos)
        {
                registro->
            CeldaRegistroProductos(registro)
        }
    }
}
@Composable
fun CeldaRegistroProductos(celdaRegistro: Producto) {
    Row() {
        Text(celdaRegistro.idProducto)
        Text(celdaRegistro.NombreProducto)
    }
}
