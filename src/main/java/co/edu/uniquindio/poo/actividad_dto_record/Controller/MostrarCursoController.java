package co.edu.uniquindio.poo.actividad_dto_record.Controller;

import co.edu.uniquindio.poo.actividad_dto_record.Model.Curso;
import co.edu.uniquindio.poo.actividad_dto_record.Model.Escuela;

import java.util.Collection;

public class MostrarCursoController {

    Escuela escuela;
    Curso curso;


    /**
     * Constructor de la clase MostrarCursoController
     * @param escuela
     * @param curso
     */
    public MostrarCursoController(Escuela escuela, Curso curso){
        this.escuela = escuela;
        this.curso = curso;
    }

    /**
     * Metodo que obtiene los cursos que hay que en la escuela
     * @return
     */
    public Collection<Curso> obtenerCusos(){
        return escuela.getCursos();
    }
}
