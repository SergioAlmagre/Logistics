package Logistics

class Store {
    var nameStore:String
    var maxLocations:Int
    var maxLines:Int

    constructor(nameStore: String, maxLocations: Int, maxLines:Int) {
        this.nameStore = nameStore
        this.maxLocations = maxLocations
        this.maxLines = maxLines
    }
}