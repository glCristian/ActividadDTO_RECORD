package co.edu.uniquindio.poo.actividad_dto_record.ViewController;

import co.edu.uniquindio.poo.actividad_dto_record.Model.*;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class MostrarEstudianteViewController {

    private Escuela escuela = Escuela.getInstance();

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
    private TableColumn<EstudianteDTO, String> tblClm_nombreEstudiantes;

    @FXML
    private TableColumn<EstudianteDTO, Integer> tblClm_edadEstudiante;

    @FXML
    private TableView<EstudianteDTO> tblVw_estudiantes;

    /**
     * Metodo que maneja el evento de clic en el boton para volver al menu de estudiante.
     * carga la vista de menu curso
     * @param event
     */
    @FXML
    void onClick_VolverMenuEstudiante(ActionEvent event) {
        cargarVista("/co/edu/uniquindio/poo/actividad_dto_record/menuEstudiante.fxml", "Menú Estudiantes");
    }

    /**
     * Metodo que maneja el evento de clic en el boton para salir de la aplicacion.
     * @param event
     */
    @FXML
    void onClick_salir(ActionEvent event) {
        Stage stage = (Stage) btn_salir.getScene().getWindow();
        stage.close();
    }

    /**
     * Metodo que se llama al inicializar el controlador.
     * Verifica que todos los elementos de la interfaz se hayan inyectado correctamente.
     */
    @FXML
    void initialize() {
        cargarEstudiantes();

        tblClm_nombreEstudiantes.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tblClm_edadEstudiante.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getEdad()).asObject());

        assert aPn_mostrarEstudiantes != null : "fx:id=\"aPn_mostrarEstudiantes\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert btn_salir != null : "fx:id=\"btn_salir\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert btn_volverMenuEstudiante != null : "fx:id=\"btn_volverMenuEstudiante\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert lbl_Estudiantes != null : "fx:id=\"lbl_Estudiantes\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert sp_estudiantes1 != null : "fx:id=\"sp_estudiantes1\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert sp_estudiantes2 != null : "fx:id=\"sp_estudiantes2\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert tblClm_edadEstudiante != null : "fx:id=\"tblClm_edadEstudiante\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert tblClm_nombreEstudiantes != null : "fx:id=\"tblClm_nombreEstudiante\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
        assert tblVw_estudiantes != null : "fx:id=\"tblVw_estudiantes\" was not injected: check your FXML file 'mostrarEstudiantes.fxml'.";
    }

    /**
     * metodo que carga la lista de estudiantes en la aplicación.
     */
    private void cargarEstudiantes() {
        if (escuela != null) {
            List<EstudianteDTO> listaDTO = escuela.getEstudiantes().stream()
                    .map(EstudianteDTO::new)
                    .collect(Collectors.toList());

            ObservableList<EstudianteDTO> estudiantes = FXCollections.observableArrayList(listaDTO);
            tblVw_estudiantes.setItems(estudiantes);
        }
    }

    /**
     * Metodo que carga una nueva vista en la aplicacion.
     * @param vista
     * @param titulo
     */
    private void cargarVista(String vista, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(vista));
            Parent root = loader.load();

            Stage stage = (Stage) aPn_mostrarEstudiantes.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
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
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
