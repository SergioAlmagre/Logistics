package com.example.logistica

import Connections.AuxClass
import Connections.Connection
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.stage.Modality
import javafx.stage.Stage

class LoginController {

    @FXML
    private lateinit var enterButton: Button

    @FXML
    private lateinit var idField: PasswordField

    @FXML
    private lateinit var nameField: TextField

    @FXML
    private lateinit var welcomeText: Label

    @FXML
    fun pushEnter(event: ActionEvent) {

//        Connection.getEmployee()
        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("menuView.fxml"))
        val scene = Scene(fxmlLoader.load())
        var stage = Stage()
        stage.title = "Estación de trabajo"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
    }

}



