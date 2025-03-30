package co.edu.uniquindio.poo.actividad_dto_record.Controller;

import co.edu.uniquindio.poo.actividad_dto_record.Model.Escuela;
import co.edu.uniquindio.poo.actividad_dto_record.Model.Estudiante;

public class MenuEstudianteController {

    Escuela escuela;
    Estudiante estudiante;


    /**
     * Constructor de la clase MenuEstudianteController
     * @param escuela
     * @param estudiante
     */
    public MenuEstudianteController(Escuela escuela, Estudiante estudiante){
        this.escuela = escuela;
        this.estudiante = estudiante;
    }


    /**
     * Metodo que busca un estudiante de la escuela utilizando su identificacion.
     * @param identificacion
     */
    public void buscarEstudiante(String identificacion){
        escuela.buscarEstudinatePorIdentificacion(identificacion);
    }

    /**
     * Metodo que agrega un estudiante a la escuela.
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante){
        escuela.agregarEstudiante(estudiante);
    }

    /**
     * Metodo que actualiza un estudiante de la escuela.
     * @param identificacion
     * @param nombre
     * @param edad
     */
    public void actualizarEstudiante(String identificacion, String nombre, int edad){
        escuela.actualizarEstudiante(identificacion,nombre,edad);
    }

    /**
     * Metodo que elimina un estudiante de la escuela utilizando su identififcacion.
     * @param identificacion
     */
    public void eliminarEstudiante(String identificacion){
        escuela.eliminarEstudiante(identificacion);
    }
}
