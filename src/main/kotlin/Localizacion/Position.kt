package Localizacion

class Position {

    var idPosition:Int?
    var empty:Int?
    var pallet:Pallet?

    constructor(idPosition: Int?, pallet: Pallet?, empty: Int?) {
        this.idPosition = idPosition
        this.pallet = pallet
        this.empty = empty
    }
}