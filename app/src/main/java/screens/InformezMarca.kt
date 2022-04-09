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
import mx.up.myapplication.Marca
import mx.up.myapplication.RegistroIOViewModel
import mx.up.myapplication.RegistroMPViewModel

@Composable
fun InformeRegistrosMarca(navcontroller: NavController){
    Scaffold() {
        val registroMPViewModel: RegistroMPViewModel = viewModel()
        TopAppBar(
            title = { Text(text = "Informes Marca") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyInformeRegistrosMarca(registroMPViewModel.registrosMarca, navcontroller)
    }
}

@Composable
fun BodyInformeRegistrosMarca(listaRegistrosMarca: List<Marca>, navcontroller: NavController)
{
    LazyColumn(modifier = Modifier.fillMaxSize())
    {
        items(items = listaRegistrosMarca)
        {
                registro->
            CeldaRegistroMarca(registro)
        }
    }
}
@Composable
fun CeldaRegistroMarca(celdaRegistro: Marca) {
    Row() {
        Text(celdaRegistro.idMarca)
        Text(celdaRegistro.NombreMarca)

    }
}
