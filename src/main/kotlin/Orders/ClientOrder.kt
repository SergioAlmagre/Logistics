package Orders

import java.time.LocalDateTime
import java.util.Date

class ClientOrder: Order {

    var idClient:Int
    var storeName: String
    var date:LocalDateTime

    constructor(idOrder: Int, status: Int, idClient: Int, storeName: String, date: LocalDateTime) : super(idOrder, status) {
        this.idClient = idClient
        this.storeName = storeName
        this.date = date
    }
}