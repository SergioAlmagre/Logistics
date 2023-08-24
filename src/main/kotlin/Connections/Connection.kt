package Connections

import Logistics.Employee
import Localizacion.Location
import Logistics.Item
import Logistics.Store
import Orders.ShoppingList
import Tools.Factory
import Tools.Messages
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.time.LocalDateTime

object Connection {

    // ********************* Atributos *************************
    var connetion: Connection? = null

    // Atributo a través del cual hacemos la conexión física.
    var sentenciaSQL: Statement? = null

    // Atributo que nos permite ejecutar una sentencia SQL
    var registros: ResultSet? = null


    fun openConnection(): Int {
        var cod = 0
        try {
            // Cargar el driver/controlador JDBC de MySql
            val controlador = "com.mysql.cj.jdbc.Driver"
            val URL_BD = "jdbc:mysql://" + Constants.server + ":" + Constants.port + "/" + Constants.bd
            Class.forName(controlador)

            // Realizamos la conexión a una BD con un usuario y una clave.
            connetion = DriverManager.getConnection(URL_BD, Constants.user, Constants.password)
            sentenciaSQL = connetion!!.createStatement()
            println("Conexion realizada con éxito")
        } catch (e: Exception) {
            println("Exception: " + e.message)
            cod = -1
        }
        return cod
    }

    fun closeConnection(): Int {
        var cod = 0
        try {
            connetion!!.close()

        } catch (ex: Exception) {
            println("Error al cerrar la conexión.")
            cod = -1
        }
        return cod
    }
    //------------------------------------------------------------------------------------------------

    fun addEmployee(nameEmployee: String, secondName:String, working:Int, idStore:Int, rol:Int){
//        var employee = Factory.createEmployee()
        var nameEmployeeDb = nameEmployee
        var secondNameEmployeeDb = secondName
        nameEmployeeDb = nameEmployeeDb.trim()
        nameEmployeeDb = nameEmployee.get(0).toString()
        secondNameEmployeeDb = nameEmployeeDb.trim()
        nameEmployeeDb = secondNameEmployeeDb
        println(nameEmployee)
        var sentence = "insert into employee values (default,?,?,?,?,?)"
        try {
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setString(1,nameEmployee)
            pstmt.setString(2,secondName)
            pstmt.setInt(3,working)
            pstmt.setInt(4,idStore)
            pstmt.setInt(5,rol)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            println(e)
        }
    }

    fun getEmployee(nameEmpoloyee:String, id:Int):Employee{
        var sentence = "select * from employee where idEmployee = ? and nameEmployee = ?"
        var emp: Employee? = null
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setInt(1,id)
            pstmt.setString(2,nameEmpoloyee)
            registros = pstmt.executeQuery()
            while (registros!!.next()){
                emp = Employee(
                    registros!!.getInt(1),
                    registros!!.getString(2),
                    registros!!.getString(3),
                    registros!!.getInt(4),
                    registros!!.getInt(5),
                    registros!!.getInt(6))
            }
        }catch (e:Exception){
            println(e)
        }
        return emp!!
    }

    fun addItem(){
        var it = Factory.createItem()
        var sentence = "insert into item values (null,?)"
        try {
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setInt(1,it.size)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            println(e)
        }
    }

    fun addLocations(location: Location){
        var sentence = "insert into location values (?,?,?,?,?,?)"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setInt(1,location.nAisle)
            pstmt.setInt(2,location.vCheck1)
            pstmt.setInt(3,location.vCheck2)
            pstmt.setInt(4,location.vCheck3)
            pstmt.setInt(5, location.nLocation)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            println(e)
        }
    }

    fun addStore(store:Store){
        var sentence = "insert into store values (?,default)"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setString(1,store.nameStore)
            pstmt.executeUpdate()
            closeConnection()
            Messages.general("New store created","Welcome")
        }catch (e:Exception){
            AuxClass.bitacoraRecord("addStore",e)
        }
    }


    // --------------------------------DELETE ALL THINGS -------------------------------
    fun deleteAllLocation(){
        var sentence = "delete from location"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord(sentence,e)
        }
    }

    fun deleteAllStores(){
        var sentence = "delete from store"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord(sentence,e)
        }
    }

    fun deleteAllContainers(){
        var sentence = "delete from container"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord(sentence,e)
        }
    }

    fun deleteAllEmployees(){
        var sentence = "delete from employee"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord(sentence,e)
        }
    }

    fun deleteAllItems(){
        var sentence = "delete from item"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord(sentence,e)
        }
    }

    fun deleteAllOrders(){
        var sentence = "delete from store"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord(sentence,e)
        }
    }

    fun deleteAllPallets(){
        var sentence = "delete from pallet"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord(sentence,e)
        }
    }

    fun factoryReset (){
        deleteAllOrders()
        deleteAllEmployees()
        deleteAllContainers()
        deleteAllItems()
        deleteAllPallets()
        deleteAllLocation()
        deleteAllStores()
    }

    fun maxItemsClientOrder(idClientOrder:Int, date:LocalDateTime):Int{
        var sentence = "SELECT MAX * from shoppingList where idClientOrder = ${idClientOrder} and date = ${date} "
        var amount = 0
        try {
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeQuery()
            amount = registros!!.getInt(1)
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord("maxItems",e)
        }
        return amount
    }

    fun maxClientOrders( date:LocalDateTime):Int{
        var sentence = "SELECT MAX * from shoppingList where date = ${date} "
        var amount = 0
        try {
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeQuery()
            amount = registros!!.getInt(1)
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord("maxItems",e)
        }
        return amount
    }

    fun maxClients():Int{
        var max = 0
        var sentence = "select max * from client"
        try {
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeQuery()
            max = registros!!.getInt(1)
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord("maxClientConnection",e)
        }
        return max
    }

    fun getShoppingList(idClientOrder: Int, date:LocalDateTime):ArrayList<Item>{
        var sentence = "select * from shoppingList where idClientOrder = ${idClientOrder} and date = ${date}"
        var shoppingList:ArrayList<Item> = ArrayList()
        var item:Item? = null
        try {
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.executeQuery()
            while (registros!!.next()){
                item = Item (
                    registros!!.getInt(1),
                    registros!!.getInt(2),
                    registros!!.getString(3)
                )
                shoppingList.add(item)
            }
            closeConnection()
        }catch (e:Exception){
            AuxClass.bitacoraRecord("getshoppingListConnection",e)
        }
        return shoppingList
    }

}