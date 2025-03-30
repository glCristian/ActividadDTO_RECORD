package co.edu.uniquindio.poo.actividad_dto_record.ViewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.actividad_dto_record.Model.Curso;
import co.edu.uniquindio.poo.actividad_dto_record.Model.Escuela;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuCursoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane aPn_MenuCurso;

    @FXML
    private Button btn_MostrarCursos;

    @FXML
    private Button btn_registrarCurso;

    @FXML
    private Button btn_salir;

    @FXML
    private Button btn_volverMenuInicio;

    @FXML
    private Label lbl_Curso;

    @FXML
    private Label lbl_NombreCurso;

    @FXML
    private Label lbl_codigoCurso;

    @FXML
    private Label lbl_duracionCurso;

    @FXML
    private Separator sp_MenuCurso1;

    @FXML
    private Separator sp_menuCurso2;

    @FXML
    private TextField txFl_codigoCurso;

    @FXML
    private TextField txFl_duracionCurso;

    @FXML
    private TextField txFl_nombreCurso;

    private Escuela escuela;
    private Curso curso;


    @FXML
    void onClick_mostrarCursos(ActionEvent event) {
        cargarVista("mostrarCursos.fxml", "Lista de Cursos");
    }

    @FXML
    void onClick_registrarCurso(ActionEvent event) {
        String nombre = txFl_nombreCurso.getText();
        String codigo = txFl_codigoCurso.getText();
        String duracionStr = txFl_duracionCurso.getText();

        if (nombre.isEmpty() || codigo.isEmpty() || duracionStr.isEmpty()) {
            mostrarAlerta("Advertencia", "Por favor, complete todos los campos.");
            return;
        }

        int duracion;
        try {
            duracion = Integer.parseInt(duracionStr);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "La duración debe ser un número válido.");
            return;
        }

        Curso curso = new Curso(nombre, codigo, duracion);
        escuela.agregarCurso(curso);
        mostrarAlerta("Registro Exitoso", "Curso registrado: " + curso.toString());

        txFl_nombreCurso.clear();
        txFl_codigoCurso.clear();
        txFl_duracionCurso.clear();
    }

    @FXML
    void onClick_salir(ActionEvent event) {
        Stage stage = (Stage) btn_salir.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClick_volverMenuInicio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menuInicio.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) aPn_MenuCurso.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Menú de Inicio");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error al cargar la vista", "No se pudo volver al menú de inicio.");
        }
    }

    @FXML
    void initialize() {
        assert aPn_MenuCurso != null : "fx:id=\"aPn_MenuCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert btn_MostrarCursos != null : "fx:id=\"btn_MostrarCursos\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert btn_registrarCurso != null : "fx:id=\"btn_registrarCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert btn_salir != null : "fx:id=\"btn_salir\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert btn_volverMenuInicio != null : "fx:id=\"btn_volverMenuInicio\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert lbl_Curso != null : "fx:id=\"lbl_Curso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert lbl_NombreCurso != null : "fx:id=\"lbl_NombreCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert lbl_codigoCurso != null : "fx:id=\"lbl_codigoCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert lbl_duracionCurso != null : "fx:id=\"lbl_duracionCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert sp_MenuCurso1 != null : "fx:id=\"sp_MenuCurso1\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert sp_menuCurso2 != null : "fx:id=\"sp_menuCurso2\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert txFl_codigoCurso != null : "fx:id=\"txFl_codigoCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert txFl_duracionCurso != null : "fx:id=\"txFl_duracionCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";
        assert txFl_nombreCurso != null : "fx:id=\"txFl_nombreCurso\" was not injected: check your FXML file 'menuCurso.fxml'.";

        escuela = new Escuela("Escuela  Union");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void cargarVista(String vista, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(vista));
            Parent root = loader.load();

            Stage stage = (Stage) aPn_MenuCurso.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error al cargar la vista", "No se pudo cargar la vista: " + vista);
        }
    }
}

