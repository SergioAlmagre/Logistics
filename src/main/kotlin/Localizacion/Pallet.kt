package Localizacion

class Pallet {

    var idPallet:Int?
    var idItem:Int?
    var initialAmount:Int?
    var remain:Int?
    var idPosition:Int?
    var empty:Int
    var damageItems:Int

    constructor(
        idPallet: Int?,
        idItem: Int?,
        initialAmount: Int?,
        remain: Int?,
        idLocation: Int?,
        empty: Int,
        damageItems: Int
    ) {
        this.idPallet = idPallet
        this.idItem = idItem
        this.initialAmount = initialAmount
        this.remain = remain
        this.idPosition = idLocation
        this.empty = empty
        this.damageItems = damageItems
    }
}