package Orders

class PickerOrder:Order {

    var idPickerOrder:Int
    var idEmployee:String

    constructor(
        idOrder: Int,
        idItem: Int,
        amount: Int,
        storeName: String,
        height: Int,
        status: String,
        idPickerOrder: Int,
        idEmployee: String
    ) : super(idOrder, idItem, amount, storeName, height, status) {
        this.idPickerOrder = idPickerOrder
        this.idEmployee = idEmployee
    }
}