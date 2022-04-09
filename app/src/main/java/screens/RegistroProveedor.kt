package screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import mx.up.myapplication.*

@Composable
fun RegistrarPro(navcontroller: NavController){
    Scaffold() {
        val registroProViewModel: RegistroProViewModel = viewModel()
        val provedorState = registroProViewModel.emisorEventos.observeAsState()
        provedorState.value?.run {
        }
        TopAppBar(
            title = { Text(text = "Registro Proveedor") },
            elevation = 10.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIco
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyRegistrarPro({registro -> registroProViewModel.agregarRegistro(registro)}
        , navcontroller)
    }
}
@Composable
fun BodyRegistrarPro (regresarregistro: (Proveedor) -> Unit, navcontroller: NavController){
    var clPro by remember { mutableStateOf("") }
    var noPro by remember { mutableStateOf("") }
    var dir by remember { mutableStateOf("") }
    var col by remember { mutableStateOf("") }
    var CP by remember { mutableStateOf("") }
    var tel by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .verticalScroll(scrollState)
            .padding(top = 40.dp)
            .fillMaxSize(1f),
           verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = clPro,
            onValueChange = { clPro = it },
            label = { Text("Clave", fontSize=10.sp) },
            modifier = Modifier.padding(top = 15.dp)
        )
        OutlinedTextField(
            value = noPro,
            onValueChange = { noPro = it },
            label = { Text("Nombre",fontSize=10.sp) },
            modifier = Modifier.padding(5.dp)
        )
        OutlinedTextField(
            value = col,
            onValueChange = { col = it },
            label = { Text("Colonia",fontSize=10.sp) },
            modifier = Modifier.padding(5.dp)
        )
        OutlinedTextField(
            value = CP,
            onValueChange = { CP = it },
            label = { Text("CP", fontSize=10.sp) },
            modifier = Modifier.padding(5.dp)
        )
        OutlinedTextField(
            value = tel,
            onValueChange = { tel = it },
            label = { Text("Telefono", fontSize=10.sp) },
            modifier = Modifier.padding(5.dp)
        )
        Row(modifier = Modifier.padding(5.dp))
        {
            Button( onClick ={ val registro = Proveedor(clPro,noPro,col, CP, tel)
                regresarregistro(registro)}){
                Text(text = "Registrar")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cancelar")
            }
        }
    }
}