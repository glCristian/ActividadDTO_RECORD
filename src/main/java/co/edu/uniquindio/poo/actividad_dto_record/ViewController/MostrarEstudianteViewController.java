package co.edu.uniquindio.poo.actividad_dto_record.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MostrarEstudianteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane aPn_mostrarEstudiantes;

    @FXML
    private Button btn_salir;

    @FXML
    private Button btn_volverMenuEstudiante;

    @FXML
    private Label lbl_Estudiantes;

    @FXML
    private Separator sp_estudiantes1;

    @FXML
    private Separator sp_estudiantes2;

    @FXML
    private TableColumn<?, ?> tblClm_edadEstudiante;

    @FXML
    private TableColumn<?, ?> tblClm_nombreEstudiantes;

    @FXML
    private TableView<?> tblVw_estudiantes;

    @FXML
    void onClick_VolverMenuEstudiante(ActionEvent event) {

    }

    @FXML
    void onClick_salir(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert aPn_mostrarEstudiantes != null : "fx:id=\"aPn_mostrarEstudiantes\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert btn_salir != null : "fx:id=\"btn_salir\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert btn_volverMenuEstudiante != null : "fx:id=\"btn_volverMenuEstudiante\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert lbl_Estudiantes != null : "fx:id=\"lbl_Estudiantes\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert sp_estudiantes1 != null : "fx:id=\"sp_estudiantes1\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert sp_estudiantes2 != null : "fx:id=\"sp_estudiantes2\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert tblClm_edadEstudiante != null : "fx:id=\"tblClm_edadEstudiante\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert tblClm_nombreEstudiantes != null : "fx:id=\"tblClm_nombreEstudiantes\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert tblVw_estudiantes != null : "fx:id=\"tblVw_estudiantes\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";

    }

}

