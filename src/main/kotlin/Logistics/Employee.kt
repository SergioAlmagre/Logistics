package Logistics

class Employee {

    var id:String
    var name:String
    var secondName:String
    var working:Int
    var rol:Int

    constructor(id: String, name: String, secondName: String,working:Int,rol:Int) {
        this.id = id
        this.name = name
        this.secondName = secondName
        this.working = working
        this.rol = rol
    }

    override fun toString(): String {
        return "Employee(id='$id', name='$name', secondName='$secondName')"
    }


}