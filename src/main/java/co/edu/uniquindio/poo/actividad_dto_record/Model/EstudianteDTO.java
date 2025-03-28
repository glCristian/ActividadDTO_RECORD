package co.edu.uniquindio.poo.actividad_dto_record.Model;


public class EstudianteDTO {
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase estudianteDTO
     * @param estudiante
     */
    public EstudianteDTO(Estudiante estudiante) {
        this.nombre = estudiante.getNombre();
        this.edad = estudiante.getEdad();
    }

    /**
     * Metodo que obtiene el nombre del estudianteDTO
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre del estudianteDTO
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene la edad del estudianteDTO
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo que establece la edad del estudianteDTO
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo toString de la clase estudianteDTO
     * @return
     */
    @Override
    public String toString() {
        return "EstudianteDTO{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}