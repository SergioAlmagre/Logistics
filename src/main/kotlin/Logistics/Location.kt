package Logistics

import Connections.AuxClass

class Location {

    var nAisle:Int
    var nLocation:Int
    var vCheck1:Int
    var vCheck2:Int
    var vCheck3:Int
    var nameStore:String?
    var side:String
    var storePallet:Array<Int> = Array(AuxClass.st!!.maxPalletsLocation){0}

    constructor(nAisle: Int, nLocation: Int, vCheck1: Int, vCheck2: Int, vCheck3: Int, nameStore:String?, side:String) {
        this.nAisle = nAisle
        this.nLocation = nLocation
        this.vCheck1 = vCheck1
        this.vCheck2 = vCheck2
        this.vCheck3 = vCheck3
        this.nameStore = nameStore
        this.side = side
    }

    override fun toString(): String {
        return "Location(nAisle=$nAisle, nLocation=$nLocation, vCheck1=$vCheck1, vCheck2=$vCheck2, vCheck3=$vCheck3, nameStore=$nameStore, side=$side)"
    }


}