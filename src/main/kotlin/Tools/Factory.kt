package Tools

import Connections.Connection
import Localizacion.Location
import Localizacion.Pallet
import Logistics.*
import Orders.ClientOrder
import java.time.LocalDateTime
import kotlin.random.Random
import kotlin.random.nextInt

object Factory {
//
//    fun createUser(){
//        val name = listOf("Juan", "Ana", "Pedro", "Lucía", "Sofía", "Miguel", "Laura", "Luis", "María", "Carlos")
//        val secondName = listOf("García", "Fernández", "Martínez", "González", "López", "Pérez", "Rodríguez", "Sánchez", "Romero", "Álvarez")
//        val id = Random.nextInt(1000,9999)
//    }


    fun createEmployee(): Employee {
        val names = listOf("Juan", "Ana", "Pedro", "Lucía", "Sofía", "Miguel", "Laura", "Luis", "María", "Carlos")
        val secondName = listOf(
            "García",
            "Fernández",
            "Martínez",
            "González",
            "López",
            "Pérez",
            "Rodríguez",
            "Sánchez",
            "Romero",
            "Álvarez"
        )
        var name = names[Random.nextInt(0, names.size)]
        var sn = secondName[Random.nextInt(0, names.size)]
        var ro = Random.nextInt(0..1)
        var emp = Employee(null, name, sn, 0, null, 1)

        return emp
    }

    fun createItem(): Item {
        val names = listOf("Milk", "Eggs", "Bread", "Lentils", "Sugar", "Peppers", "Cheese", "Chocolat", "Pizza", "Toilet pappel")
        var name = names[Random.nextInt(0, names.size)]
        var size = Random.nextInt(2, 25)
        var item = Item(null,size,name)
        return item
    }

    fun createShoppingList():ArrayList<Item>{
        var shoppingList = ArrayList<Item>()
        var randomNumItems = Random.nextInt(1,23)
        for (i in 1..randomNumItems){
            shoppingList.add(createItem())
        }
        return shoppingList
    }

    fun createClientOrderAuto(){
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
        // fix idPosition
        var pallet = Pallet(null,randomItem,maxItemsPallet,maxItemsPallet,0,0,0)
//    Client Order
        var clientOrder = ClientOrder(1,1,randomIdClients,store.nameStore,date)
        var shoppingList = Factory.createShoppingList()

        println(pallet)
        println(clientOrder)
        println(shoppingList)
    }


}




















//    fun createLocations(store:Store): Location {
//        var st = store
//        var nAisle:Int
//        var nLocation:Int
//        var vCheck1:Int
//        var vCheck2:Int
//        var vCheck3:Int
//        var maxLocationsAils = (st.maxLocations/st.maxPalletsLocation)/st.maxLines
//        var loc: Location? = null
//        var nLoc = 1
//        var pair:Boolean = false
//
//        for (i in 1..st.maxLines){
//            var letterSide = "L"
//            nLoc = 1
//            for (j in 1..maxLocationsAils){
//                if (pair){
//                    letterSide = "R"
//                    pair = false
//                }else{
//                    letterSide = "L"
//                    pair = true
//                }
//                var nchecks = randomCheck()
//                loc = Location(i,nLoc++,nchecks[0],nchecks[1],nchecks[2],st.nameStore,letterSide)
//                Connection.addLocations(loc)
//                println(loc)
//            }
//            println("-----------------------------------------------")
//        }
//    return loc!!
//    }
//
//    fun randomCheck():Array<Int>{
//        var ar = Array<Int>(3){0}
//        var cont = 0
//        do {
//            for (i in 0..ar.size-1){
//                ar[i] = Random.nextInt(10,100)
//            }
//
//            cont = 0
//            var t = 1
//            var aux = ar[0]
//            while (cont < 2 && t < 3 ) {
//                if (aux == ar[t]) {
//                    cont++
//                }
//                t++
//            }
//        }while (cont != 0)
//        return ar
//    }
//
//        fun createLocations(store:Store): Location {
//        var st = store
//        var nAisle:Int
//        var nLocation:Int
//        var vCheck1:Int
//        var vCheck2:Int
//        var vCheck3:Int
//        var maxLocationsAils = (st.maxLocations/st.maxPalletsLocation)/st.maxLines
//        var loc: Location? = null
//        var nLoc = 1
//        var pair:Boolean = false
//
//        for (i in 1..st.maxLines){
//            var letterSide = "L"
//            nLoc = 1
//            for (j in 1..maxLocationsAils){
//                if (pair){
//                    letterSide = "R"
//                    pair = false
//                }else{
//                    letterSide = "L"
//                    pair = true
//                }
//                var nchecks = randomCheck()
//                loc = Location(i,nLoc++,nchecks[0],nchecks[1],nchecks[2],st.nameStore,letterSide)
//                Connection.addLocations(loc)
//                println(loc)
//            }
//            println("-----------------------------------------------")
//        }
//    return loc!!
//    }
//
//    fun randomCheck():Array<Int>{
//        var ar = Array<Int>(3){0}
//        var cont = 0
//        do {
//            for (i in 0..ar.size-1){
//                ar[i] = Random.nextInt(10,100)
//            }
//
//            cont = 0
//            var t = 1
//            var aux = ar[0]
//            while (cont < 2 && t < 3 ) {
//                if (aux == ar[t]) {
//                    cont++
//                }
//                t++
//            }
//        }while (cont != 0)
//        return ar
//    }
//
//}