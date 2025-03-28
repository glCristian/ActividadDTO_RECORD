package co.edu.uniquindio.poo.actividad_dto_record.model;


public class EstudianteDTO {
    private String nombre;
    private int edad;

    public EstudianteDTO(Estudiante estudiante) {
        this.nombre = estudiante.getNombre();
        this.edad = estudiante.getEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "EstudianteDTO{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}