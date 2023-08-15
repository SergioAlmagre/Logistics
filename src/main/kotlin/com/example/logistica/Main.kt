package com.example.logistica

import Connections.AuxClass
import Connections.Connection
import Logistics.Store
import Tools.Factory
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("loginView.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Welcome!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)

//    Connection.addEmployee()
//    println(employee)
    Connection.addItem()
    Connection.addEmployee()
    var store = Store("CoofeShop", 100,5,2)
//    Connection.addStore(store)
//    var loca = Factory.createLocations(store)





}