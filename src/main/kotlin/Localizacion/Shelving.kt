package Localizacion

class Shelving {

    var maxPalletsBehind:Int
    var maxLevels:Int
    var idLocation:Int?
    var shelving:Array<Array<Position>>? = Array(10){Array<Position>(10){ Position(null,null,null,null) } }

//    Array(maxPalletsBehind) { Array(maxLevels) { Position(null,null,null,null) } }

    constructor(unitsPalletsAmount: Int, idLocation: Int?, maxLevel:Int) {
        this.maxPalletsBehind = unitsPalletsAmount
        this.idLocation = idLocation
        this.maxLevels = maxLevel
    }


    fun setPositions(fil:Int, col:Int, newPosition:Position){
        this.shelving!![fil][col] = newPosition
    }

    override fun toString(): String {
        return "Shelving(maxPalletsBehind=$maxPalletsBehind, maxLevels=$maxLevels, idLocation=$idLocation, shelving=${shelving.contentToString()})"
    }


}