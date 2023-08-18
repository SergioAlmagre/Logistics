package Logistics

class Client {

    var idClient:Int
    var nif:Int
    var name:String
    var idStore:Int

    constructor(idClient: Int, nif: Int, name: String, idStore: Int) {
        this.idClient = idClient
        this.nif = nif
        this.name = name
        this.idStore = idStore
    }

    override fun toString(): String {
        return "Client(idClient=$idClient, nif=$nif, name='$name', idStore=$idStore)"
    }


}