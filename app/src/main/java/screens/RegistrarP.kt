import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import mx.up.myapplication.Producto
import mx.up.myapplication.RegistroPViewModel

@Composable
fun RegistrarP(navcontroller: NavController){
    Scaffold() {
        val registroPViewModel: RegistroPViewModel = viewModel()
        val productostate = registroPViewModel.emisorEventos.observeAsState()
        productostate.value?.run{
            //Si el valor de State value no es nulo ejecutalo
        }
        TopAppBar(
            title = { Text(text = "Registro Producto") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = {navcontroller.popBackStack()}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyRegistrarP({ registro ->
            registroPViewModel.agregarRegistro(registro)}, navcontroller)

    }
}
@Composable
fun BodyRegistrarP (regresarregistro: (Producto) -> Unit, navcontroller: NavController){
    var idProducto by remember { mutableStateOf("") }
    var nombreProducto by remember { mutableStateOf("") }
    Column(Modifier.padding(top = 40.dp).fillMaxSize(1f)) {
        Row(horizontalArrangement = Arrangement.Start) {
            Column(Modifier.padding(vertical = 20.dp), horizontalAlignment = Alignment.Start) {
                Text(text = "Clave producto: ", modifier = Modifier.padding(10.dp))
                Text(text = "Nombre producto: ", modifier = Modifier.padding(10.dp))
            }
            Column(Modifier.padding(vertical = 30.dp)){
                OutlinedTextField(
                    value = idProducto,
                    onValueChange = {idProducto=it},
                    modifier = Modifier.padding(10.dp).height(15.dp)
                )
                OutlinedTextField(
                    value = nombreProducto,
                    onValueChange = {nombreProducto=it},
                    modifier = Modifier.padding(10.dp).height(15.dp)
                )
            }
        }
        Row(Modifier.padding(5.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically){
            Button(onClick = { var registro = Producto(idProducto, nombreProducto)
                regresarregistro(registro)}) {
                Text(text="Registrar")
            }
            Button(onClick = {}, ) {
                Text(text="cancelar")
            }
        }
    }
}

