package Logistics

class Pallet {

    var idPallet:Int?
    var idItem:Int
    var amount:Int
    var nAisle:Int
    var nLocation:Int

    constructor(idPallet: Int?, idItem: Int, amount: Int, nAisle: Int, nLocation: Int) {
        this.idPallet = idPallet
        this.idItem = idItem
        this.amount = amount
        this.nAisle = nAisle
        this.nLocation = nLocation
    }

    override fun toString(): String {
        return "Pallet(idPallet=$idPallet, idItem=$idItem, amount=$amount, nAisle=$nAisle, nLocation=$nLocation)"
    }


}