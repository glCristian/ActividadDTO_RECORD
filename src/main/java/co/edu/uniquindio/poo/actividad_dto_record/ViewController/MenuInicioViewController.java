package co.edu.uniquindio.poo.actividad_dto_record.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class MenuInicioViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane aPn_menuInicio;

    @FXML
    private Button btn_curso;

    @FXML
    private Button btn_estudiante;

    @FXML
    private Label lbl_gestionEstudiantesCursos;

    @FXML
    void onClick_curso(ActionEvent event) {

    }

    @FXML
    void onClick_estudiante(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert aPn_menuInicio != null : "fx:id=\"aPn_menuInicio\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert btn_curso != null : "fx:id=\"btn_curso\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert btn_estudiante != null : "fx:id=\"btn_estudiante\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert lbl_gestionEstudiantesCursos != null : "fx:id=\"lbl_gestionEstudiantesCursos\" was not injected: check your FXML file 'menuInicio.fxml'.";

    }

}

