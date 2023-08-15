package Logistics

class Employee {

    var id:String
    var name:String
    var secondName:String

    constructor(id: String, name: String, secondName: String) {
        this.id = id
        this.name = name
        this.secondName = secondName
    }

    override fun toString(): String {
        return "Employee(id='$id', name='$name', secondName='$secondName')"
    }


}