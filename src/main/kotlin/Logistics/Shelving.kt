package Logistics

class Shelving {

    var unitsPalletsAmount:Int?
    var maxLevels:Int = 0
    var idLocation:Int?
    val shelving = Array(0) { Array<Position>(maxLevels) { Position(null,null) } }


    constructor(unitsPalletsAmount: Int?, idLocation: Int?,maxLevel:Int) {
        this.unitsPalletsAmount = unitsPalletsAmount
        this.idLocation = idLocation
        this.maxLevels = maxLevel
    }
}