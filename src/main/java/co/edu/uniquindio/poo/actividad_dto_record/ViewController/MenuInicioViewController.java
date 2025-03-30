package co.edu.uniquindio.poo.actividad_dto_record.ViewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private Label lbl_EscuelaUnion;

    @FXML
    private Separator sp_menuInicio;

    /**
     *Metodo que maneja el evento de clic en el boton para regresar al menu de inicio.
     * Carga la vista de menu inicio.
     * @param event
     */
    @FXML
    void onClick_curso(ActionEvent event) {
        cargarVista("/co/edu/uniquindio/poo/actividad_dto_record/menuCurso.fxml", "Menu de Curso");
    }

    /**
     * Metodo que maneja el evento de clic en el boton para abrir el menu de estudiante.
     * carga la vista de menu estudiante
     * @param event
     */
    @FXML
    void onClick_estudiante(ActionEvent event) {
        cargarVista("/co/edu/uniquindio/poo/actividad_dto_record/menuEstudiante.fxml", "Menu de Estudiante");
    }

    /**
     * Metodo que se llama al inicializar el controlador.
     * Verifica que todos los elementos de la interfaz se hayan inyectado correctamente.
     */
    @FXML
    void initialize() {
        assert aPn_menuInicio != null : "fx:id=\"aPn_menuInicio\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert btn_curso != null : "fx:id=\"btn_curso\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert btn_estudiante != null : "fx:id=\"btn_estudiante\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert lbl_EscuelaUnion != null : "fx:id=\"lbl_EscuelaUnion\" was not injected: check your FXML file 'menuInicio.fxml'.";
        assert sp_menuInicio != null : "fx:id=\"sp_menuInicio\" was not injected: check your FXML file 'menuInicio.fxml'.";

    }

    /**
     * Metodo que carga una nueva vista en la aplicación.
     * @param vista
     * @param titulo
     */
    private void cargarVista(String vista, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(vista));
            Parent root = loader.load();

            Stage stage = (Stage) aPn_menuInicio.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Menu Inicio");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error al cargar la vista", "No se pudo cargar la vista: " + vista);
        }
    }

    /**
     * Metodo que muestra una alerta con un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
