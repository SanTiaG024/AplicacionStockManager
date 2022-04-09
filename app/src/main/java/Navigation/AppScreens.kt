package Navigation

import android.appwidget.AppWidgetProvider
import android.media.MediaRouter2

sealed class AppScreens(val route:String){
    object Menu: AppScreens(route = "Menu_principal")
    object Informes: AppScreens(route =  "pantalla_Informes")
    object Registro: AppScreens(route =  "pantalla_Registros")
    object EntradaSalida: AppScreens(route = "pantalla_rinput&output")
    object RegistrarMP: AppScreens(route ="pantalla_registroMarca")
    object InformeRegistrosIO: AppScreens(route= "pantalla-informeInputOutput")
    object ResgistrarPro: AppScreens(route = "Pantalla Regitro-de-provedor")
    object RegistrarP: AppScreens(route = "Pantalla Registro de Producto")
    object ConsultarP:AppScreens(route = "PANTALLA Consulta Lroductos")
    object InformeRegistrosProveedores:AppScreens(route = "Pantalla InformeProveedores")
    object InformeRegistrosMarca:AppScreens(route = "Pantalla Informes Marca")
    object InformeRegistrosProducto:AppScreens(route = "Informes Informes Productos")

}

