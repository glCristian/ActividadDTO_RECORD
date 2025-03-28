package co.edu.uniquindio.poo.actividad_dto_record.Model;

public record EstudianteRecord(String nombre, int edad) {

    /**
     * Metodo toString de la clase estudianteRecord
     * @return
     */
    @Override
    public String toString() {
        return "EstudianteRecord{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}