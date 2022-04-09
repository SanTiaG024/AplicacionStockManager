package Navigation

import RegistrarP
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import screens.*

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController=navController, startDestination = AppScreens.Menu.route)
    {
        composable(route = AppScreens.Menu.route){
            Menu(navController)
        }
        composable(route = AppScreens.Registro.route){
            Registro(navController)
        }
        composable(route = AppScreens.Informes.route){
            Informes(navController)
        }
        composable(route = AppScreens.EntradaSalida.route){
            EntradaSalida(navController)
        }
        composable(route = AppScreens.RegistrarMP.route){
            RegistrarMP(navController)
        }
        composable(route = AppScreens.InformeRegistrosIO.route){
            InformeRegistrosIO(navController)
        }
        composable(route = AppScreens.ResgistrarPro.route)
        {
            RegistrarPro(navController)
        }
        composable(route = AppScreens.RegistrarP.route)
        {
            RegistrarP(navController)
        }
        composable(route = AppScreens.ConsultarP.route)
        {
            ConsultarP(navController)
        }
        composable(route = AppScreens.InformeRegistrosProveedores.route)
        {
            InformeRegistrosProveedores(navController)
        }
        composable(route=AppScreens.InformeRegistrosMarca.route)
        {
            InformeRegistrosMarca(navController)
        }
        composable(route = AppScreens.InformeRegistrosProveedores.route)
        {
            InformeRegistrosProducto(navController)
        }
    }
}