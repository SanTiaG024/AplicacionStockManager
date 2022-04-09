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
import mx.up.myapplication.Proveedor
import mx.up.myapplication.RegistroIOViewModel
import mx.up.myapplication.RegistroProViewModel
import java.time.Period

@Composable
fun InformeRegistrosProveedores(navcontroller: NavController){
    Scaffold() {
        val registroProViewModel: RegistroProViewModel = viewModel()
        TopAppBar(
            title = { Text(text = "Informes Proveedores") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyInformeRegistrosProveedores(registroProViewModel.registrosProveedor, navcontroller)
    }
}

@Composable
fun BodyInformeRegistrosProveedores(listaRegistrosProveedor: List<Proveedor>, navcontroller: NavController)
{
    LazyColumn(modifier = Modifier.fillMaxSize())
    {
        items(items = listaRegistrosProveedor)
        {
                registro->
            CeldaRegistroProveedor(registro)
        }
    }
}
@Composable
fun CeldaRegistroProveedor(celdaRegistro: Proveedor) {
    Row() {
        Text(celdaRegistro.clave)
        Text(celdaRegistro.Nombre)
        Text(celdaRegistro.colonia)
        Text(celdaRegistro.cp)
        Text(celdaRegistro.telefono)
    }
}
