package com.example.logistica

import Connections.AuxClass
import Connections.Connection
import Logistics.Store
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.TextField

class CreateCompanyController {

    var store = Store("CoofeShop", 100,5,2)
//        AuxClass.st = store
////    Connection.addStore(store)
////    var loca = Factory.createLocations(store)

    @FXML
    private lateinit var MaxPalletLocatioField: TextField

    @FXML
    private lateinit var MaxPalletsStorageField: TextField

    @FXML
    private lateinit var companyNameField: TextField

    @FXML
    private lateinit var maxAilsField: TextField

    @FXML
    fun registerButtonPush(event: ActionEvent) {
        AuxClass.st!!.nameStore = companyNameField.text
        AuxClass.st!!.maxLines = maxAilsField.text.toInt()
        AuxClass.st!!.maxLocations = MaxPalletsStorageField.text.toInt()
        AuxClass.st!!.maxPalletsLocation = MaxPalletLocatioField.text.toInt()
        Connection.addStore(AuxClass.st!!)
    }

}
