package com.example.logistica

import Connections.AuxClass
import Connections.Connection
import Tools.Messages
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.stage.Modality
import javafx.stage.Stage
import java.net.URL
import java.util.*

class LoginController:Initializable {

    @FXML
    private lateinit var enterButton: Button

    @FXML
    private lateinit var idField: PasswordField

    @FXML
    private lateinit var nameField: TextField

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        nameField.requestFocus()
    }


    @FXML
    fun pushEnter(event: ActionEvent) {
        /**
         * 0 - SYSTEM ADMIN
         * 1 - COMPANY CEO
         * 2 - WORKER PICKER
         * 3 - OTHERS
         */
        try{
            AuxClass.em = Connection.getEmployee(nameField.text,idField.text.toInt())

            var view:String = ""
            when (AuxClass.em!!.rol){
                0->{view = "menuView.fxml" }
                1->{view = "controlPanelView.fxml" }
                2->{view = "pickerView.fxml"}
                3->{view = "pickerView.fxml"}
                4->{view = "controlPanelView.fxml"}
            }
                println(AuxClass.em)
                val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource(view))
                val scene = Scene(fxmlLoader.load())
                var stage = Stage()
                stage.title = "Logistics Nederland"
                stage.scene = scene
                stage.initModality(Modality.APPLICATION_MODAL)
                stage.showAndWait()
        }catch (e:Exception){
            AuxClass.bitacoraRecord("pushEnter",e)
            Messages.employeeNotFound()
        }

    }



}



