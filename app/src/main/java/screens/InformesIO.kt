
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
import mx.up.myapplication.RegistroIOViewModel

@Composable
fun InformeRegistrosIO(navcontroller: NavController){
    Scaffold() {
        val registroIOViewModel: RegistroIOViewModel = viewModel()
        TopAppBar(
            title = { Text(text = "Informes Input/Output") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyInformeRegistrosIO(registroIOViewModel.registros, navcontroller)
    }
}

@Composable
fun BodyInformeRegistrosIO(listaRegistrosIO: List<IOProducto>,navcontroller: NavController)
{
    LazyColumn(modifier = Modifier.fillMaxSize())
    {
        items(items = listaRegistrosIO)
        {
                registro->
            CeldaRegistro(registro)
        }
    }
}
@Composable
fun CeldaRegistro(celdaRegistro: IOProducto) {
    Row() {
        Text(celdaRegistro.idProducto)
        Text(celdaRegistro.cantidad.toString())
        Text(celdaRegistro.Fecha)
    }
}
