package screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ConsultarP(navcontroller: NavController) {
    Scaffold() {
        TopAppBar(
            title = { Text(text = "Consultar Producto") },
            elevation = 14.dp,
            navigationIcon = {
                IconButton(onClick = { navcontroller.popBackStack() }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "")
                }//NavIcon
            },
            modifier = Modifier.padding(bottom = 20.dp)
        )
        BodyConsultarP(navcontroller)
    }
}
@Composable
fun BodyConsultarP(navcontroller: NavController) {
    val (idProducto, searchidProducto) = remember { mutableStateOf("") }
    Column(Modifier.height(600.dp)){
        Row(Modifier.padding(15.dp)){
            Column(Modifier.width(325.dp)){
                Text(text="Consultar Producto", fontSize=30.sp)
            }
            Column(Modifier.width(75.dp)){
                Button(onClick = { /*TODO*/ }) {
                    Text(text="<")
                }
            }
        }
        Row(
            Modifier
                .padding(15.dp)
                .height(40.dp)){
            Column(
                Modifier
                    .width(150.dp)
                    .padding(10.dp)){
                Text(text="ID Producto: ")
            }
            Column(Modifier.width(150.dp)) {
                OutlinedTextField(
                    value = idProducto,
                    onValueChange = searchidProducto,
                    modifier = Modifier.padding(10.dp).height(15.dp)
                )
            }
            Column(Modifier.width(50.dp)) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text="Q")
                }
            }
        }
        Row(Modifier.padding(15.dp)){
            Column(Modifier.padding(5.dp)){
                Row(Modifier.padding(5.dp)){
                    Text(text="Nombre del producto: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Marca: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Proveedor: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Existencias: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Precio: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Almacen: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Última entrada: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Última salida: ",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Observaciones: ",fontSize=17.sp)
                }
            }
            Column(Modifier.padding(5.dp)){
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
                Row(Modifier.padding(5.dp)){
                    Text(text="Ejemplo",fontSize=17.sp)
                }
            }
        }
        Row(Modifier.padding(15.dp)){
            Column(Modifier.padding(5.dp)){
                Button(onClick = { /*TODO*/ }) {
                    Text(text="Registrar entrada")
                }
            }
            Column(Modifier.padding(5.dp)){
                Button(onClick = { /*TODO*/ }) {
                    Text(text="Registrar salida")
                }
            }
        }
    }
}