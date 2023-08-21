package Logistics

/**
 * The size is represented in liters.
 */

class Item {

    var idItem:Int?

    var size:Int
    var nameItem:String

    constructor(idItem: Int?, size: Int,name: String) {
        this.idItem = idItem
        this.nameItem = name
        this.size = size
    }
}