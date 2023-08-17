package Connections

import Logistics.*
import Orders.PickerOrder

object AuxClass {

    var co : Container? = null
    var em : Employee? = null
    var it : Item? = null
    var lo: Location? = null
    var or: PickerOrder? = null
    var pa: Pallet? = null
    var st: Store? = null

    fun bitacoraRecord(sentence:String, e:Exception){
        println(sentence)
        println(e)



    }


}