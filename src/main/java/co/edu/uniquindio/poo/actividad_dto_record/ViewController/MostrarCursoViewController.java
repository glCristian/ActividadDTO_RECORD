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

public class MostrarCursoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane aPn_mostrarCursos;

    @FXML
    private Button btn_salir;

    @FXML
    private Button btn_volverMenuCurso;

    @FXML
    private Label lbl_cursos;

    @FXML
    private Separator sp_cursos1;

    @FXML
    private Separator sp_cursos2;

    @FXML
    private TableColumn<?, ?> tblClm_duracionCurso;

    @FXML
    private TableColumn<?, ?> tblClm_nombreCurso;

    @FXML
    private TableView<?> tblVw_cursos;

    @FXML
    void onClick_VolverMenuCurso(ActionEvent event) {

    }

    @FXML
    void onClick_salir(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert aPn_mostrarCursos != null : "fx:id=\"aPn_mostrarCursos\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert btn_salir != null : "fx:id=\"btn_salir\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert btn_volverMenuCurso != null : "fx:id=\"btn_volverMenuCurso\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert lbl_cursos != null : "fx:id=\"lbl_cursos\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert sp_cursos1 != null : "fx:id=\"sp_cursos1\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert sp_cursos2 != null : "fx:id=\"sp_cursos2\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert tblClm_duracionCurso != null : "fx:id=\"tblClm_duracionCurso\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert tblClm_nombreCurso != null : "fx:id=\"tblClm_nombreCurso\" was not injected: check your FXML file 'mostrarCursos.fxml'.";
        assert tblVw_cursos != null : "fx:id=\"tblVw_cursos\" was not injected: check your FXML file 'mostrarCursos.fxml'.";

    }

}

