package co.edu.uniquindio.poo.actividad_dto_record.Model;

public class Estudiante {

    private String nombre;
    private int edad;
    private String identificacion;

    /**
     * Constructor de la clase Estudiante
      * @param nombre
     * @param edad
     * @param identificacion
     */
    public Estudiante(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    /**
     * Metodo que obtiene el nombre de estudiante
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre del estudiante
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene la edad del estudiante
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo que establece la edad del estudiante
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que obtiene la identificacion del estudiante
     * @return
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Metodo que establece la identificacion del estudiante
     * @param identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Metodo toString de la clase Estudiante
     * @return
     */
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
