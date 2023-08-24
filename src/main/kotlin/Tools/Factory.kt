package Tools

import Localizacion.Location
import Localizacion.Pallet
import Localizacion.Position
import Localizacion.Shelving
import Logistics.*
import Orders.ClientOrder
import java.time.LocalDateTime
import kotlin.random.Random
import kotlin.random.nextInt

object Factory {
    var idClientOrder = 0

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

    fun createClientOrderAuto(store:Store){
//    Client
        var date = LocalDateTime.now()
        var maxClients:Int = 10
        var randomIdClients:Int = Random.nextInt(1,maxClients)
//    Client Order
        idClientOrder++
        var clientOrder = ClientOrder(idClientOrder,1,randomIdClients,store.nameStore,date)
        var shoppingList = createShoppingList()
        println(clientOrder)
        println(shoppingList)
    }


    fun createLocationsAndShelvings(maxPalletsBehind:Int, maxLevels:Int, maxLocations:Int, store:Store){
        var idLocation = 1
        var maxLocations = maxPalletsBehind * maxLevels * maxLocations
        var nAisle = 1
        var location:Location? = null
        var shelvings:Shelving? = null
        var position:Position? = null

        for (i in 0..maxLocations){
            position = Position(null,null,null,idLocation)
            shelvings = Shelving(maxPalletsBehind,i,maxLevels)
            for (fil in 0..maxLevels){
                for (col in 0..maxPalletsBehind){
                    shelvings.setPositions(fil,col,position)
                }
            }
            location = Location(idLocation,nAisle,i,45,45,83,store.idStore!!)
            location.addShelving(shelvings)
            idLocation++
            println(location)
        }
        nAisle++ //fix this objet

    }



    fun addPalletToShelvingAutoRandom(shelvings: Shelving){
        var maxLocations = shelvings.maxLevels * shelvings.maxPalletsBehind
        var maxItemsClientOrder:Int = 10
        var idPosition:Int = Random.nextInt(0,maxLocations)
        var randomItem:Int = Random.nextInt(1,maxItemsClientOrder)
        var maxItemsPallet:Int = Random.nextInt(20,135)
        var pallet = Pallet(null,randomItem,maxItemsPallet,maxItemsPallet,0,0,0)
        println(pallet)
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