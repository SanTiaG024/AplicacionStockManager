package screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import mx.up.myapplication.IOProducto
import mx.up.myapplication.RegistroIOViewModel


@Composable
fun EntradaSalida(navcontroller: NavController){
    Scaffold() {
        val registroIOViewModel: RegistroIOViewModel = viewModel()
        val inoutState = registroIOViewModel.emisorEventos.observeAsState()
        inoutState.value?.run {
            //Si el valor de State value no es nulo ejecutalo
        }
        TopAppBar(
            title = { Text(text = "Registro Input/Output") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        FormatoRegistroIO({ registro ->
            registroIOViewModel.agregarRegistro(registro)
        }, navcontroller)
    }
}
@Composable
fun FormatoRegistroIO(regresarregistro: (IOProducto) -> Unit, navcontroller: NavController) {
    var idProducto by remember { mutableStateOf("") }
    var cantidad by remember { mutableStateOf("") }
    var fecha by remember { mutableStateOf("") }
    Column(
        Modifier
            .padding(top = 40.dp)
            .fillMaxSize(1f)) {
        Row(Modifier.padding(15.dp)) {
            Column(Modifier.padding(5.dp)) {
                Row(Modifier.padding(top = 27.dp, bottom = 27.dp)) {
                    Text(text = "Id Producto: ")
                }
                Row(Modifier.padding(top = 29.dp, bottom = 29.dp)) {
                    Text("Cantidad: ")
                }
                Row(Modifier.padding(top = 29.dp, bottom = 29.dp)) {
                    Text("Fecha: ")
                }
            }
            Column(Modifier.padding(5.dp)) {
                Row(
                    Modifier
                        .padding(top = 30.dp, bottom = 30.dp)
                        .height(20.dp)
                ) {
                    OutlinedTextField(
                        value = idProducto,
                        onValueChange = { idProducto = it }
                    )
                }
                Row(
                    Modifier
                        .padding(top = 30.dp, bottom = 30.dp)
                        .height(20.dp)
                ) {
                    OutlinedTextField(
                        value = cantidad, onValueChange = {cantidad = it}
                    )
                }
                Row(
                    Modifier
                        .padding(top = 30.dp, bottom = 30.dp)
                        .height(20.dp)
                ) {
                    OutlinedTextField(value = fecha, onValueChange ={fecha = it})
                }
                Row(
                    Modifier
                        .padding(top = 30.dp, bottom = 30.dp)
                ) {
                    Button(onClick = {
                        var registro = IOProducto(idProducto, cantidad, fecha)
                        Log.d("r",registro.toString())
                        regresarregistro(registro)
                    }) {
                        Text("Registrar")
                    }
                }
            }
        }
    }
}


