package Logistics

class Order {

    var idOrder:Int
    var idItem:Int
    var amount:Int
    var storeName:String
    var idEmployee:String
    var status:String

    constructor(idOrder: Int, idItem: Int, amount: Int, storeName: String, idEmployee: String,status:String) {
        this.idOrder = idOrder
        this.idItem = idItem
        this.amount = amount
        this.storeName = storeName
        this.idEmployee = idEmployee
        this.status = status
    }



}