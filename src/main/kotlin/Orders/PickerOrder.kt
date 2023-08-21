package Orders

import Logistics.Item

class PickerOrder:Order {

    var idEmployee:String

    constructor(idOrder: Int, status: Int, idEmployee: String) : super(idOrder, status) {
        this.idEmployee = idEmployee
    }
}