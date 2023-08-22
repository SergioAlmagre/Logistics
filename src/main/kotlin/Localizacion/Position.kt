package Localizacion

class Position {

    var idPosition:Int?
    var empty:Int?
    var pallet:Pallet?
    var idLocation:Int

    constructor(idPosition: Int?, pallet: Pallet?, empty: Int?, idLocation:Int) {
        this.idPosition = idPosition
        this.pallet = pallet
        this.empty = empty
        this.idLocation = idLocation
    }

    override fun toString(): String {
        return "Position(idPosition=$idPosition, empty=$empty, pallet=$pallet, idLocation=$idLocation)"
    }


}