package Logistics

/**
 * The size is represented in liters.
 */

class Item {

    var idItem:Int?
    var nameItem:String
    var size:Int

    constructor(idItem: Int?, name: String, size: Int) {
        this.idItem = idItem
        this.nameItem = name
        this.size = size
    }
}