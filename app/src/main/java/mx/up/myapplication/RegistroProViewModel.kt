package mx.up.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


data class Proveedor(val clave: String,val Nombre:String, val colonia:String, val cp:String, val telefono:String)

class RegistroProViewModel: ViewModel(){
    val emisorEventos= MutableLiveData<List<Proveedor>>()
    val registrosProveedor = arrayListOf<Proveedor>()
    fun agregarRegistro(proveedor: Proveedor)
    {
        registrosProveedor.add(proveedor)
        emisorEventos.postValue(registrosProveedor)
    }
}