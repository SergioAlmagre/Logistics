package com.example.logistica

import Connections.AuxClass
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Modality
import javafx.stage.Stage

class MenuController {

    @FXML
    fun ControlPanelButtonPush(event: ActionEvent) {

    }

    @FXML
    fun adminButtonPush(event: ActionEvent) {

    }

    @FXML
    fun newCompanyButtonPush(event: ActionEvent) {
        println(AuxClass.em)
        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("createCompanyView.fxml"))
        val scene = Scene(fxmlLoader.load())
        var stage = Stage()
        stage.title = "New company"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

    @FXML
    fun pickerButtonPush(event: ActionEvent) {

    }
    @FXML
    fun MyCompanyButtonPush(event: ActionEvent) {

    }

}
