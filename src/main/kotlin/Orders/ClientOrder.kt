package Orders

class ClientOrder: Order {

    var idClientOrder:Int
    var idClient:Int

    constructor(
        idOrder: Int,
        idItem: Int,
        amount: Int,
        storeName: String,
        height: Int,
        status: String,
        idClientOrder: Int,
        idClient: Int
    ) : super(idOrder, idItem, amount, storeName, height, status) {
        this.idClientOrder = idClientOrder
        this.idClient = idClient
    }


}