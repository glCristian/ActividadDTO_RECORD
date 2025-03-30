package co.edu.uniquindio.poo.actividad_dto_record.Controller;

import co.edu.uniquindio.poo.actividad_dto_record.Model.Curso;
import co.edu.uniquindio.poo.actividad_dto_record.Model.Escuela;

public class MenuCursoController {

    Escuela escuela;
    Curso curso;

    /**
     * Constructor de la clase MenuCursoController
     * @param escuela
     * @param curso
     */
    public MenuCursoController(Escuela escuela, Curso curso){
        this.escuela = escuela;
        this.curso = curso;
    }

    /**
     * Metodo que Busca un curso en la escuela utilizando su código.
     * @param codigo
     */
    public void buscarCurso(String codigo){
        escuela.buscarCursoPorCodigo(codigo);
    }

    /**
     * Metodo que agrega un curso a la escuela.
     * @param curso
     */
    public void agregarCurso(Curso curso){
        escuela.agregarCurso(curso);
    }

    /**
     * Metodo que actualiza un curso en la escuela.
     * @param codigo
     * @param nombre
     * @param duracion
     */
    public void actualizarCurso(String codigo, String nombre, int duracion){
        escuela.actualizarCurso(codigo,nombre, duracion);
    }

    /**
     * Metodo que elimina un curso en la escuela utilizando su código.
     * @param codigo
     */
    public void eliminarCurso(String codigo){
        escuela.eliminarCurso(codigo);
    }
}
