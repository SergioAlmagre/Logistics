package Logistics

class Employee {

    var idEmployee:Int?
    var nameEmployee:String
    var secondName:String
    var working:Int
    var idStore:Int?
    var rol:Int


    constructor(idEmployee: Int?, nameEmployee: String, secondName: String, working: Int, idStore: Int?,rol: Int) {
        this.idEmployee = idEmployee
        this.nameEmployee = nameEmployee
        this.secondName = secondName
        this.working = working
        this.rol = rol
        this.idStore = idStore
    }

    override fun toString(): String {
        return "Employee(idEmployee='$idEmployee', nameEmployee='$nameEmployee', secondName='$secondName', working=$working, rol=$rol, idStore=$idStore)"
    }


}