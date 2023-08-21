package Tools

import javafx.scene.control.Alert
import javafx.scene.control.ButtonType

object Messages {
    fun alert (cabecera:String,contenido:String): ButtonType {
        var alert = Alert(Alert.AlertType.WARNING)
        alert.title = "Atención!"
        alert.headerText = cabecera
        alert.contentText = contenido

        alert.buttonTypes.remove(ButtonType.OK)
        alert.buttonTypes.remove(ButtonType.CANCEL)

        alert.buttonTypes.add(ButtonType.YES)
        alert.buttonTypes.add(ButtonType.NO)

        return alert.showAndWait().orElse(ButtonType.YES)
    }

    fun employeeNotFound (): ButtonType {
        var title = "User not found"
        var content = ""
        var alert = Alert(Alert.AlertType.WARNING)
        alert.title = "Atention"
        alert.headerText = title
        alert.contentText = content

        return alert.showAndWait().orElse(ButtonType.OK)
    }

    fun general (title:String, content:String): ButtonType {
        var alert = Alert(Alert.AlertType.WARNING)
        alert.title = "Info"
        alert.headerText = title
        alert.contentText = content

        return alert.showAndWait().orElse(ButtonType.OK)
    }

}