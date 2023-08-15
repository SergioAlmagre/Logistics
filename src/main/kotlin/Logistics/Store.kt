package Logistics

class Store {
    var nameStore:String
    var maxLocations:Int
    var maxLines:Int
    var maxPalletsLocation:Int

    constructor(nameStore: String, maxLocations: Int, maxLines:Int, maxPalletsLocation:Int) {
        this.nameStore = nameStore
        this.maxLocations = maxLocations
        this.maxLines = maxLines
        this.maxPalletsLocation = maxPalletsLocation
    }
}