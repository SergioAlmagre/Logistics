package com.example.logistica

import Connections.Connection
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Modality
import javafx.stage.Stage

class AdminController {

    @FXML
    fun backButtonPush(event: ActionEvent) {
        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("menuView.fxml"))
        val scene = Scene(fxmlLoader.load())
        var stage = Stage()
        stage.title = "Estación de trabajo"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

    @FXML
    fun FactoryResetButtPush(event: ActionEvent) {
        Connection.factoryReset()

    }

    @FXML
    fun addEmploButtonPush(event: ActionEvent) {
//        Connection.addEmployee()

    }

    @FXML
    fun addItemButtonPush(event: ActionEvent) {
        Connection.addItem()
    }



    @FXML
    fun delAllEmplButtPush(event: ActionEvent) {
        Connection.deleteAllEmployees()
    }

    @FXML
    fun delAllItemButtPush(event: ActionEvent) {
        Connection.deleteAllItems()
    }

    @FXML
    fun delAllLocaButtPush(event: ActionEvent) {
        Connection.deleteAllLocation()
    }

}
