package Logistics

class Pallet {

    var idPallet:Int?
    var idItem:Int?
    var amount:Int?
    var idLocation:Int?

    constructor(idPallet: Int?, idItem: Int?, amount: Int?, idLocation: Int?) {
        this.idPallet = idPallet
        this.idItem = idItem
        this.amount = amount
        this.idLocation = idLocation
    }

    override fun toString(): String {
        return "Pallet(idPallet=$idPallet, idItem=$idItem, amount=$amount)"
    }


}