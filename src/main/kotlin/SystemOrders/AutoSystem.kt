package SystemOrders

import Localizacion.Pallet
import Logistics.Store
import Orders.ClientOrder
import Tools.Factory
import java.time.LocalDateTime
import kotlin.random.Random

/**
 * Locations must be created before
 */

class AutoSystem {

//    Store
        var store = Store("THC",null)
//    Client
        var date = LocalDateTime.now()
        var maxClients:Int = 10
        var randomIdClients:Int = Random.nextInt(1,maxClients)
//    Client Order
        var clientOrder = ClientOrder(1,1,randomIdClients,store.nameStore,date)
        var shoppingList = Factory.createShoppingList()
}