package Logistics

class Employee {

    var idEmployee:String
    var nameEmployee:String
    var secondName:String
    var working:Int
    var rol:Int
    var idStore:Int

    constructor(idEmployee: String, nameEmployee: String, secondName: String, working: Int, rol: Int, idStore: Int) {
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