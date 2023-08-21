package com.example.logistica

import Connections.AuxClass
import Connections.Connection
import Logistics.Store
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField

class CreateCompanyController {

    @FXML
    private lateinit var buttonRegister: Button

    @FXML
    private lateinit var companyNameField: TextField

    @FXML
    fun registerButtonPush(event: ActionEvent) {
        try{
            AuxClass.st = Store(companyNameField.text,null)
            println(AuxClass)
            AuxClass.st!!.nameStore = AuxClass.st!!.nameStore.uppercase().trim()
            Connection.addStore(AuxClass.st!!)
        }catch (e:Exception){
            AuxClass.bitacoraRecord("registerButtonPush",e)
        }


    }


}
