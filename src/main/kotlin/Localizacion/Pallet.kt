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
        idPosition: Int?,
        empty: Int,
        damageItems: Int
    ) {
        this.idPallet = idPallet
        this.idItem = idItem
        this.initialAmount = initialAmount
        this.remain = remain
        this.idPosition = idPosition
        this.empty = empty
        this.damageItems = damageItems
    }

    override fun toString(): String {
        return "Pallet(idPallet=$idPallet, idItem=$idItem, initialAmount=$initialAmount, remain=$remain, idPosition=$idPosition, empty=$empty, damageItems=$damageItems)"
    }


}