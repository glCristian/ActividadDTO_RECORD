module co.edu.uniquindio.poo.actividad_dto_record {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.poo.actividad_dto_record to javafx.fxml;
    exports co.edu.uniquindio.poo.actividad_dto_record;
    exports co.edu.uniquindio.poo.actividad_dto_record.App;
    opens co.edu.uniquindio.poo.actividad_dto_record.App to javafx.fxml;
}