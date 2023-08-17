package Connections

import Logistics.Employee
import Logistics.Location
import Logistics.Store
import Tools.Factory
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

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

    fun getEmployee(nameEmpoloye:String ,id:Int):Employee{
        var sentence = "select * from employee where idEmployee = ?,?"
        var emp: Employee? = null
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setInt(1,id)
            pstmt.setString(2,nameEmpoloye)
            registros = pstmt.executeQuery()
            while (registros!!.next()){
                emp = Employee(
                    registros!!.getString(1),
                    registros!!.getString(2),
                    registros!!.getString(3),
                    registros!!.getInt(4),
                    registros!!.getInt(5))
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

    fun addLocations(location:Location){
        var sentence = "insert into location values (?,?,?,?,?,?,?)"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setInt(1,location.nAisle)
            pstmt.setInt(2,location.vCheck1)
            pstmt.setInt(3,location.vCheck2)
            pstmt.setInt(4,location.vCheck3)
            pstmt.setString(5,location.nameStore)
            pstmt.setInt(6, location.nLocation)
            pstmt.setString(7,location.side)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            println(e)
        }
    }

    fun addStore(store:Store){
        var sentence = "insert into store values (?,?,?)"
        try{
            openConnection()
            var pstmt = connetion!!.prepareStatement(sentence)
            pstmt.setString(1,store.nameStore)
            pstmt.setInt(2,store.maxLocations)
            pstmt.setInt(3,store.maxLines)
            pstmt.executeUpdate()
            closeConnection()
        }catch (e:Exception){
            println(e)
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




}