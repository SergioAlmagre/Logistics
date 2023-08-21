package Orders

import Connections.Connection
import Logistics.Item

open class Order {

    var idOrder: Int
    var status: Int




    constructor(
        idOrder: Int,
        status: Int,
    ) {
        this.idOrder = idOrder
        this.status = status
    }
}



