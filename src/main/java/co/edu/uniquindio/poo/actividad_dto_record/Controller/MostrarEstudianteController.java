package co.edu.uniquindio.poo.actividad_dto_record.Controller;

import co.edu.uniquindio.poo.actividad_dto_record.Model.Escuela;
import co.edu.uniquindio.poo.actividad_dto_record.Model.Estudiante;

import java.util.Collection;

public class MostrarEstudianteController {

    Escuela escuela;
    Estudiante estudiante;


    /**
     * Constructor de la clase MostrarEstudianteController
     * @param escuela
     * @param estudiante
     */
    public MostrarEstudianteController(Escuela escuela, Estudiante estudiante){
        this.escuela = escuela;
        this.estudiante = estudiante;
    }


    /**
     * Metodo que obtiene los estudiantes que hay que en la escuela
     * @return
     */
    public Collection<Estudiante> obtenerEstudientes(){
        return escuela.getEstudiantes();
    }
}
}
