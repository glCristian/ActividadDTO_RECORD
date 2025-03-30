package co.edu.uniquindio.poo.actividad_dto_record.App;

import co.edu.uniquindio.poo.actividad_dto_record.Model.Curso;
import co.edu.uniquindio.poo.actividad_dto_record.Model.Escuela;
import co.edu.uniquindio.poo.actividad_dto_record.Model.Estudiante;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Escuela escuela = Escuela.getInstance();

    static{

        Curso curso0 = new Curso("Programación", "POO", 10);
        escuela.agregarCurso(curso0);

        Estudiante estudiante0 = new Estudiante("Cristian", 18, "1234");
        escuela.agregarEstudiante(estudiante0);

    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/co/edu/uniquindio/poo/actividad_dto_record/menuInicio.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Menú de Inicio");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al cargar la vista: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}