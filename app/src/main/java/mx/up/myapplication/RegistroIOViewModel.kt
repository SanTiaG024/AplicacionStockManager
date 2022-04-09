package mx.up.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class IOProducto(val idProducto:String,val cantidad:String,val Fecha:String)

class RegistroIOViewModel: ViewModel(){
    val emisorEventos = MutableLiveData<List<IOProducto>>()
    val registros = arrayListOf<IOProducto>()
    fun agregarRegistro(inout:IOProducto)
    {
        registros.add(inout)
        emisorEventos.postValue(registros)
    }
}