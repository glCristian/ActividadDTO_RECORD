package co.edu.uniquindio.poo.actividad_dto_record.Model;

public record CursoRecord(String nombreCurso, int duracion) {

    /**
     * Metodo toString de la clase cursoRecord
     * @return
     */
    @Override
    public String toString() {
        return "CursoRecord{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}