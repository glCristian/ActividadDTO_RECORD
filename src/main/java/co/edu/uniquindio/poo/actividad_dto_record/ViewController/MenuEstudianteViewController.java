package co.edu.uniquindio.poo.actividad_dto_record.ViewController;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.poo.actividad_dto_record.Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuEstudianteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane aPn_MenuEstudiante;

    @FXML
    private Button btn_MostrarEstudiantes;

    @FXML
    private Button btn_registrarEstudiante;

    @FXML
    private Button btn_salir;

    @FXML
    private Button btn_volverMenuInicio;

    @FXML
    private Label lbl_Estudiante;

    @FXML
    private Label lbl_NombreEstudiante;

    @FXML
    private Label lbl_EdadEstudiante;

    @FXML
    private Label lbl_IdentificacionEstudiante;

    @FXML
    private Separator sp_MenuEstudiante1;

    @FXML
    private Separator sp_menuEstudiante2;

    @FXML
    private TextField txFl_nombreEstudiante;

    @FXML
    private TextField txFl_edadEstudiante;

    @FXML
    private TextField txFl_identificacionEstudiante;

    private Escuela escuela = Escuela.getInstance();

    /**
     *  Metodo que maneja el evento de clic en el boton para mostrar la lista de estudiantes.
     *  Carga la vista de mostrar estudiantes.
     * @param event
     */
    @FXML
    void onClick_mostrarEstudiantes(ActionEvent event) {
        cargarVista("/co/edu/uniquindio/poo/actividad_dto_record/mostrarEstudiantes.fxml", "Lista de Estudiantes");
    }

    /**
     * Metodo que maneja el evento de clic en el boton para registrar un nuevo estudiante.
     * Valida la entrada del usuario y agrega el estudiante a la escuela.
     * @param event
     */
    @FXML
    void onClick_registrarEstudiante(ActionEvent event) {
        String nombre = txFl_nombreEstudiante.getText();
        String edadStr = txFl_edadEstudiante.getText();
        String identificacion = txFl_identificacionEstudiante.getText();

        if (nombre.isEmpty() || edadStr.isEmpty() || identificacion.isEmpty()) {
            mostrarAlerta("Advertencia", "Por favor, complete todos los campos.");
            return;
        }

        int edad;
        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "La edad debe ser un número válido.");
            return;
        }

        Estudiante estudiante = new Estudiante(nombre, edad, identificacion);
        escuela.agregarEstudiante(estudiante);
        mostrarAlerta("Registro Exitoso", "Estudiante registrado: " + estudiante.toString());

        txFl_nombreEstudiante.clear();
        txFl_edadEstudiante.clear();
        txFl_identificacionEstudiante.clear();
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
     * Metodo que maneja el evento de clic en el boton para volver al menu principal.
     * Carga la vista del menu principal.
     * @param event
     */
    @FXML
    void onClick_volverMenuInicio(ActionEvent event) {
        cargarVista("/co/edu/uniquindio/poo/actividad_dto_record/menuInicio.fxml", "Menú principal");
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

    /**
     * Metodo que carga una nueva vista en la aplicacion.
     * @param vista
     * @param titulo
     */
    private void cargarVista(String vista, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(vista));
            Parent root = loader.load();

            Stage stage = (Stage) aPn_MenuEstudiante.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error al cargar la vista", "No se pudo cargar la vista: " + vista);
        }
    }
}
