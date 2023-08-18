package Localizacion

class Shelving {

    var maxPalletsBehind:Int
    var maxLevels:Int = 0
    var idPosition:Int?
    val shelvings = Array(0) { Array<Position?>(maxLevels) {null}}


    constructor(unitsPalletsAmount: Int, idLocation: Int?,maxLevel:Int) {
        this.maxPalletsBehind = unitsPalletsAmount
        this.idPosition = idLocation
        this.maxLevels = maxLevel
    }
}