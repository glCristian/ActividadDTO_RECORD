package co.edu.uniquindio.poo.actividad_dto_record.model;

public record CursoRecord(String nombreCurso, int duracion) {
    @Override
    public String toString() {
        return "CursoRecord{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}