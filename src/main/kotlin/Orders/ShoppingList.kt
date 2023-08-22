package Orders

import Connections.Connection
import Logistics.Item
/**
 * Matrix ShoppigList
 * Colum 0 - idItem
 * Colum 1 - amount
 * Colum 3 - weight
 * Colum 4 - status
 */
class ShoppingList {

    var shoppingList = ArrayList<Item?>()

    fun addRandomItem(amount:Int){

//        shoppingList =

    }

    override fun toString(): String {
        return "ShoppingList(shoppingList=$shoppingList)"
    }


}