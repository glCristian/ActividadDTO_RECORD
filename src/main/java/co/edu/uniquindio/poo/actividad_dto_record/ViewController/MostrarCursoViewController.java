package co.edu.uniquindio.poo.actividad_dto_record.ViewController;

import co.edu.uniquindio.poo.actividad_dto_record.Model.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MostrarCursoViewController {


    private Escuela escuela = Escuela.getInstance();

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
    private TableColumn<Curso, Integer> tblClm_duracionCurso;

    @FXML
    private TableColumn<Curso, String > tblClm_nombreCurso;

    @FXML
    private TableView<Curso> tblVw_cursos;

    @FXML
    void onClick_VolverMenuCurso(ActionEvent event) {
        cargarVista("/co/edu/uniquindio/poo/actividad_dto_record/menuCurso.fxml","Menu cursos");
    }

    @FXML
    void onClick_salir(ActionEvent event) {
        Stage stage = (Stage) btn_salir.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {

        cargarCursos();

        tblClm_nombreCurso.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tblClm_duracionCurso.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getDuracion()).asObject());



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




    private void cargarCursos() {
        if (escuela != null) {
            ObservableList<Curso> cursos = FXCollections.observableArrayList(escuela.getCursos());
            tblVw_cursos.setItems(cursos);
        }
    }


    private void cargarVista(String vista, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(vista));
            Parent root = loader.load();

            Stage stage = (Stage) aPn_mostrarCursos.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error al cargar la vista", "No se pudo cargar la vista: " + vista);
        }
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}

