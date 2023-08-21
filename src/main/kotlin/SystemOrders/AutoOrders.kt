package SystemOrders

import Connections.Connection
import Localizacion.Pallet
import Logistics.Item
import Logistics.Store
import Orders.ClientOrder
import Orders.ShoppingList
import java.time.LocalDateTime
import kotlin.random.Random

/**
 * Locations must be created before
 */

class AutoOrders {

//    Store
        var store = Store("THC",null)

//    Client
        var date = LocalDateTime.now()
        var maxClients:Int = Connection.maxClients()
        var randomIdClients:Int = Random.nextInt(1,maxClients)

//    Shopping list
        var maxClientOrders = Connection.maxClientOrders(date)
        var randomClientOrder = Random.nextInt(1,maxClientOrders)
        var randomAmountItems:Int = Random.nextInt(1,7)
        var randomWeight:Int = Random.nextInt(1,12)

//    Items
        var maxItemsClientOrder:Int = Connection.maxItemsClientOrder(randomClientOrder,date)
        var randomItem:Int = Random.nextInt(1,maxItemsClientOrder)
//    Items name
        val names = listOf("Milk", "Eggs", "Bread", "Lentils", "Sugar", "Peppers", "Cheese", "Chocolat", "Pizza", "Toilet pappel")
        var name = names[Random.nextInt(0, names.size)]
//    Pallet
        var maxItemsPallet:Int = Random.nextInt(20,135)
//    Storage
        var pallet = Pallet(null,randomItem,Random.nextInt(0,maxItemsPallet),maxItemsPallet,1,0,0)
//    Client Order
       var shoppingList = Connection.getShoppingList()
       var clientOrder = ClientOrder(null!!,1,randomIdClients,store.nameStore,date)
}