package mx.up.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Producto(val idProducto: String,val NombreProducto:String)

class RegistroPViewModel: ViewModel(){
    val emisorEventos= MutableLiveData<List<Producto>>()
    val registrosProducto = arrayListOf<Producto>()
    fun agregarRegistro(inmarca:Producto)
    {
        registrosProducto.add(inmarca)
        emisorEventos.postValue(registrosProducto)
    }
}