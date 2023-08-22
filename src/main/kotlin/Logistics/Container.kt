package Logistics

/**
 * maximum capacity 100 liters
 */


class Container {

    var idContainer:Int
    var idEmployee:Int
    var freeSpaceInside:Int
    var items: Array<Item?> = Array(0){null}

    constructor(idContainer: Int, idEmployee: Int, freeSpace: Int) {
        this.idContainer = idContainer
        this.idEmployee = idEmployee
        this.freeSpaceInside = freeSpace
    }

    override fun toString(): String {
        return "Container(idContainer=$idContainer, idEmployee=$idEmployee, freeSpaceInside=$freeSpaceInside, items=${items.contentToString()})"
    }


}