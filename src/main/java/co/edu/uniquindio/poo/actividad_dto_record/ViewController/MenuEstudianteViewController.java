package co.edu.uniquindio.poo.actividad_dto_record.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
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
    private Label lbl_edadEstudiante;

    @FXML
    private Label lbl_identificacionEstudiante;

    @FXML
    private Separator sp_MenuEstudiante1;

    @FXML
    private Separator sp_menuEstudiante2;

    @FXML
    private TextField txFl_edadEstudiante;

    @FXML
    private TextField txFl_identificacionEstudiante;

    @FXML
    private TextField txFl_nombreEstudiante;

    @FXML
    void onClick_mostrarEstudiantes(ActionEvent event) {
        //cargarVista("mostrarEstudiantes.fxml");
    }

    @FXML
    void onClick_registrarEstudiante(ActionEvent event) {

        String nombre = txFl_nombreEstudiante.getText();
        String edadStr = txFl_edadEstudiante.getText();
        String identificacion = txFl_identificacionEstudiante.getText();

        if (nombre.isEmpty() || edadStr.isEmpty() || identificacion.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, complete todos los campos.");
            alert.showAndWait();
            return;
        }
    }

    @FXML
    void onClick_salir(ActionEvent event) {
        Stage stage = (Stage) btn_salir.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClick_volverMenuInicio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("co/edu/uniquindio/poo/actividad_dto_record/menuInicio.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));

            Stage currentStage = (Stage) btn_volverMenuInicio.getScene().getWindow();
            currentStage.close();

            newStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert aPn_MenuEstudiante != null : "fx:id=\"aPn_MenuEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert btn_MostrarEstudiantes != null : "fx:id=\"btn_MostrarEstudiantes\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert btn_registrarEstudiante != null : "fx:id=\"btn_registrarEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert btn_salir != null : "fx:id=\"btn_salir\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert btn_volverMenuInicio != null : "fx:id=\"btn_volverMenuInicio\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert lbl_Estudiante != null : "fx:id=\"lbl_Estudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert lbl_NombreEstudiante != null : "fx:id=\"lbl_NombreEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert lbl_edadEstudiante != null : "fx:id=\"lbl_edadEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert lbl_identificacionEstudiante != null : "fx:id=\"lbl_identificacionEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert sp_MenuEstudiante1 != null : "fx:id=\"sp_MenuEstudiante1\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert sp_menuEstudiante2 != null : "fx:id=\"sp_menuEstudiante2\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert txFl_edadEstudiante != null : "fx:id=\"txFl_edadEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert txFl_identificacionEstudiante != null : "fx:id=\"txFl_identificacionEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";
        assert txFl_nombreEstudiante != null : "fx:id=\"txFl_nombreEstudiante\" was not injected: check your FXML file 'menuEstudiante.fxml'.";

    }

}
