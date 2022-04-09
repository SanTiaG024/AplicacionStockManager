package screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import mx.up.myapplication.Marca
import mx.up.myapplication.RegistroMPViewModel

@Composable
fun RegistrarMP(navcontroller:NavController){
    Scaffold() {
        val registroMPViewModel: RegistroMPViewModel = viewModel()
        val marcatState = registroMPViewModel.emisorEventos.observeAsState()
        marcatState.value?.run{ //Si el valor de State value no es nulo ejecutalo
        }
        TopAppBar(
            title = { Text(text = "Registro Marca") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyRegistrarMP({ registro ->
            registroMPViewModel.agregarRegistro(registro)
            navcontroller}, navcontroller)
    }
}
@Composable
fun BodyRegistrarMP (regresarregistro: (Marca) -> Unit,navcontroller: NavController){
    var idMarca by remember { mutableStateOf("") }
    var nombreMarca  by remember { mutableStateOf("") }
    Column(Modifier.padding(top = 40.dp).fillMaxSize(1f)) {
        Row(horizontalArrangement = Arrangement.Start) {
            Column(Modifier.padding(vertical = 20.dp), horizontalAlignment = Alignment.Start) {
                Text(text = "Clave marca/producto: ", modifier = Modifier.padding(10.dp))
                Text(text = "Nombre marca/producto: ", modifier = Modifier.padding(10.dp))
            }
            Column(Modifier.padding(vertical = 30.dp)){
                OutlinedTextField(
                    value = idMarca,
                    onValueChange = {idMarca=it},
                    modifier = Modifier.padding(10.dp).height(15.dp)
                )
                OutlinedTextField(
                    value = nombreMarca,
                    onValueChange = {nombreMarca = it},
                    modifier = Modifier.padding(10.dp).height(15.dp)
                )
            }
        }
        Row(Modifier.padding(5.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically){
            Button(onClick = { var registro = Marca(idMarca, nombreMarca)
                regresarregistro(registro)}) {
                Text(text="Registrar")
            }
            Button(onClick = {}, ) {
                Text(text="cancelar")
            }
        }
    }
}
