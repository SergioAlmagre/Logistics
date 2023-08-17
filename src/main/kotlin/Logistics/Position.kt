package Logistics

class Position {

    var idPosition:Int?
    var pallet = Pallet(null,null,null,null)

    constructor(idPosition: Int?, pallet: Pallet?) {
        this.idPosition = idPosition
        this.pallet = pallet!!
    }
}