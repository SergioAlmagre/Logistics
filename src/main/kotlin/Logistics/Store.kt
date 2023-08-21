package Logistics

class Store {
    var nameStore:String
    var idStore:Int?

    constructor(nameStore: String, idStore: Int?) {
        this.nameStore = nameStore
        this.idStore = idStore
    }

    override fun toString(): String {
        return "Store(nameStore='$nameStore', idStore=$idStore)"
    }


}