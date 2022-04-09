package mx.up.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Marca(val idMarca: String,val NombreMarca:String)

class RegistroMPViewModel: ViewModel(){
    val emisorEventos= MutableLiveData<List<Marca>>()
    val registrosMarca = arrayListOf<Marca>()
    fun agregarRegistro(inmarca:Marca)
    {
        registrosMarca.add(inmarca)
        emisorEventos.postValue(registrosMarca)
    }
}