package co.edu.uniquindio.poo.actividad_dto_record.Model;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Escuela {

    String nombre;
    private Collection<Estudiante> estudiantes;
    private Collection<Curso> cursos;

    /**
     * Metodo constructor de la clase escuela
     * @param nombre
     */
    public Escuela(String nombre){
        this.nombre = nombre;
        this.estudiantes = new LinkedList<>();
        this.cursos = new LinkedList<>();
    }



    //------------------------------------------CRUDS--------------------------------------------//

    /**
     * Metodo que busca a un estudiante dentro de la lista de estudiantes de la escuela
     * @param identificacion
     * @return estudiante
     */
    public Estudiante buscarEstudinatePorIdentificacion(String identificacion) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getIdentificacion().equals(identificacion)) {
                return estudiante;
            }
        }
        System.out.println("Estudiante no encontrado.");
        return null;
    }

    /**
     * Metodo para agregar un estudiante a la lista de estudiantes
     * @param estudiante
     */
    public void agregarPaciente(Estudiante estudiante) {
        if (buscarEstudinatePorIdentificacion(estudiante.getIdentificacion()) == null) {
            estudiantes.add(estudiante);
            System.out.println("Estudinate agregado correctamente.");
        } else {
            System.out.println("Error: Ya existe un estudiante con esta identificación.");
        }
    }

    /**
     * Metodo para actualizar los datos de un estuiante
     * @param identificacion
     * @param nuevoNombre
     * @param nuevaEdad
     */
    public void actualizarEstudiante(String identificacion, String nuevoNombre, int nuevaEdad) {
        Estudiante estudiante = buscarEstudinatePorIdentificacion(identificacion);
        if (estudiante != null) {
            if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                estudiante.setNombre(nuevoNombre);
            }
            if ( nuevaEdad > 0) {
                estudiante.setEdad(nuevaEdad);
            }
            System.out.println("Estudiante actualizado correctamente.");
        } else {
            System.out.println("Error: No se encontró el estudiante para actualizar.");
        }
    }

    /**
     * Metodo para eliminar a un estudiante
     * @param identificacion
     */
    public void eliminarEstudiante(String identificacion) {
        Estudiante estudiante = buscarEstudinatePorIdentificacion(identificacion);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
            System.out.println("Estudiante eliminado correctamente ");
        } else {
            System.out.println("Error: No se encontró el estudiante para eliminar ");
        }
    }


    /**
     * Metodo para buscar un curso por su codigo
     * @param codigo
     * @return curso
     */
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        System.out.println("Curso no encontrado.");
        return null;
    }

    /**
     * Metodo para agregar un curso
     * @param curso
     */
    public void agregarCurso(Curso curso) {
        if (buscarCursoPorCodigo(curso.getCodigo()) == null) {
            cursos.add(curso);
            System.out.println("Curso agregado correctamente.");
        } else {
            System.out.println("Error: Ya existe un curso con ese codigo.");
        }
    }

    /**
     * Metodo para actualizar los datos de un curso
     * @param codigo
     * @param nuevoNombre
     * @param nuevaDuracion
     */
    public void actualizarCurso(String codigo, String nuevoNombre, int nuevaDuracion) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                curso.setNombre(nuevoNombre);
            }
            if ( nuevaDuracion > 0) {
                curso.setDuracion(nuevaDuracion);
            }
            System.out.println("Curso actualizado correctamente.");
        } else {
            System.out.println("Error: No se encontró el curso para actualizar.");
        }
    }

    /**
     * Metodo para eliminar un curso
     * @param codigo
     */
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            cursos.remove(curso);
            System.out.println("Curso eliminado correctamente ");
        } else {
            System.out.println("Error: No se encontró el curso para eliminar ");
        }
    }



    //---------------------------------Gets y Sets----------------------------------//
    /**
     * Metodo para obtener el nombre de la escuela
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que esteblece el nombre de la escuela
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la lista de estudiantes de la escuela
     * @return estudiantes
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Metodo para establecer la lista de estudiantes de la escuela
     * @param estudiantes
     */
    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Metodo para obtener la lista de cursos de la escuela
     * @return cursos
     */
    public Collection<Curso> getCursos() {
        return cursos;
    }

    /**
     * Metodo para establecer la lista de cursos de la ecuela
     * @param cursos
     */
    public void setCursos(Collection<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     * Metodo tostring de la clase escuela
     * @return toString
     */
    @Override
    public String toString() {
        return "Escuela{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + estudiantes +
                ", cursos=" + cursos +
                '}';
    }
}
