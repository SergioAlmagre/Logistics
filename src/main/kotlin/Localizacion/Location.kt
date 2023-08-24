package Localizacion

import Connections.AuxClass

class Location {

    var idLocation:Int
    var nAisle:Int
    var nLocation:Int
    var vCheck1:Int
    var vCheck2:Int
    var vCheck3:Int
    var idStore:Int
    var shelving: Shelving? = null

    constructor(
        idLocation: Int,
        nAisle: Int,
        nLocation: Int,
        vCheck1: Int,
        vCheck2: Int,
        vCheck3: Int,
        idStore: Int,
    ) {
        this.idLocation = idLocation
        this.nAisle = nAisle
        this.nLocation = nLocation
        this.vCheck1 = vCheck1
        this.vCheck2 = vCheck2
        this.vCheck3 = vCheck3
        this.idStore = idStore
    }



    fun addShelving(shelving:Shelving){
        this.shelving = shelving
    }

    override fun toString(): String {
        return "Location(idLocation=$idLocation, nAisle=$nAisle, nLocation=$nLocation, vCheck1=$vCheck1, vCheck2=$vCheck2, vCheck3=$vCheck3, idStore=$idStore, shelving=$shelving)"
    }


}