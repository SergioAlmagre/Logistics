package Orders

open class Order {

    var idOrder: Int
    var idItem: Int
    var amount: Int
    var storeName: String
    var height:Int
    var status: String

    constructor(idOrder: Int, idItem: Int, amount: Int, storeName: String, height: Int, status: String) {
        this.idOrder = idOrder
        this.idItem = idItem
        this.amount = amount
        this.storeName = storeName
        this.height = height
        this.status = status
    }
}



