package com.example.logistica

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Modality
import javafx.stage.Stage

class MenuController {
    @FXML
    fun ControlPanelButtonPush(event: ActionEvent) {
        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("ControlPanelView.fxml"))
        val scene = Scene(fxmlLoader.load())
        var stage = Stage()
        stage.title = "Estación de trabajo"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

    @FXML
    fun adminButtonPush(event: ActionEvent) {
        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("adminView.fxml"))
        val scene = Scene(fxmlLoader.load())
        var stage = Stage()
        stage.title = "Estación de trabajo"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

    @FXML
    fun newCompanyButtonPush(event: ActionEvent) {
        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("createCompanyView.fxml"))
        val scene = Scene(fxmlLoader.load())
        var stage = Stage()
        stage.title = "Estación de trabajo"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

    @FXML
    fun pickerButtonPush(event: ActionEvent) {
        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("pickerView.fxml"))
        val scene = Scene(fxmlLoader.load())
        var stage = Stage()
        stage.title = "Estación de trabajo"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.showAndWait()
    }

}
