package co.edu.uniquindio.poo.actividad_dto_record.Model;

import java.util.LinkedList;
import java.util.List;
import java.util.Collection;

public class Curso {
    private String nombre;
    private int duracion;
    private String codigo;
    private Collection<Estudiante> estudiantes;


    /**
     * Método constructor de la clase curso
     * @param nombre
     * @param codigo
     * @param duracion
     */
    public Curso(String nombre, String codigo, int duracion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.duracion = duracion;
        this.estudiantes = new LinkedList<>();
    }


    /**
     * metodo para obtener el nombre del curso
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo para establecer el nombre del curso
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo para obtener la duracion del curso
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * metodo para establecer la duracion del curso
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * metodo para obtener el codigo del curso
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * metodo para establecer el codigo del curso
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * metodo para obtener la lista de estudiantes del curso
     * @return estudiantes
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * metodo para establecer la lista des estudiantes del curso
     * @param estudiantes
     */
    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    /**
     * metodo toString de la clase curso
     * @return
     */
    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", codigo='" + codigo + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}