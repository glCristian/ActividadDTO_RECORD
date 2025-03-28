package co.edu.uniquindio.poo.actividad_dto_record.model;

public record EstudianteRecord(String nombre, int edad) {
    @Override
    public String toString() {
        return "EstudianteRecord{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}