package SystemOrders

import Connections.Connection
import Localizacion.Pallet
import Logistics.Store
import Orders.ClientOrder
import Tools.Factory
import java.time.LocalDateTime
import kotlin.random.Random

/**
 * Locations must be created before
 */

class AutoClientOrder {

//    Store
        var store = Store("THC",null)
//    Client
        var date = LocalDateTime.now()
        var maxClients:Int = 10
        var randomIdClients:Int = Random.nextInt(1,maxClients)
//    Items
        var maxItemsClientOrder:Int = 10
        var randomItem:Int = Random.nextInt(1,maxItemsClientOrder)
//    Pallet
        var maxItemsPallet:Int = Random.nextInt(20,135)
        var pallet = Pallet(null,randomItem,Random.nextInt(0,maxItemsPallet),maxItemsPallet,0,1,0)
//    Client Order
        var clientOrder = ClientOrder(null!!,1,randomIdClients,store.nameStore,date)
        var shoppingList = Factory.createShoppingList()



}