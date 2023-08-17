package Tools

import Connections.Connection
import Logistics.*
import kotlin.random.Random
import kotlin.random.nextInt

object Factory {

    fun createUser(){
        val name = listOf("Juan", "Ana", "Pedro", "Lucía", "Sofía", "Miguel", "Laura", "Luis", "María", "Carlos")
        val secondName = listOf("García", "Fernández", "Martínez", "González", "López", "Pérez", "Rodríguez", "Sánchez", "Romero", "Álvarez")
        val id = Random.nextInt(1000,9999)
    }


    fun createEmployee():Employee{

        val names = listOf("Juan", "Ana", "Pedro", "Lucía", "Sofía", "Miguel", "Laura", "Luis", "María", "Carlos")
        val secondName = listOf("García", "Fernández", "Martínez", "González", "López", "Pérez", "Rodríguez", "Sánchez", "Romero", "Álvarez")
        val id = Random.nextInt(1000,9999).toString()
        var name = names[Random.nextInt(0,names.size)]
        var sn = secondName[Random.nextInt(0,names.size)]
        var ro = Random.nextInt(0..1)
        var emp = Employee(id,name,sn,0,ro)

        return emp
    }

    fun createItem():Item{
        var size = Random.nextInt(2,25)
        var item = Item(null,"Example",15)
        return item
    }

    fun createLocations(store:Store): Location {
        var st = store
        var nAisle:Int
        var nLocation:Int
        var vCheck1:Int
        var vCheck2:Int
        var vCheck3:Int

        var maxLocationsAils = (st.maxLocations/st.maxPalletsLocation)/st.maxLines
        var loc: Location? = null
        var nLoc = 1
        var pair:Boolean = false

        for (i in 1..st.maxLines){
            var letterSide = "L"
            nLoc = 1
            for (j in 1..maxLocationsAils){
                if (pair){
                    letterSide = "R"
                    pair = false
                }else{
                    letterSide = "L"
                    pair = true
                }
                var nchecks = randomCheck()
                loc = Location(i,nLoc++,nchecks[0],nchecks[1],nchecks[2],st.nameStore,letterSide)
                Connection.addLocations(loc)
                println(loc)
            }
            println("-----------------------------------------------")
        }
    return loc!!
    }

    fun randomCheck():Array<Int>{
        var ar = Array<Int>(3){0}
        var cont = 0
        do {
            for (i in 0..ar.size-1){
                ar[i] = Random.nextInt(10,100)
            }

            cont = 0
            var t = 1
            var aux = ar[0]
            while (cont < 2 && t < 3 ) {
                if (aux == ar[t]) {
                    cont++
                }
                t++
            }
        }while (cont != 0)
        return ar
    }

}