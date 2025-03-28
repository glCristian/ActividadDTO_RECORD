package co.edu.uniquindio.poo.actividad_dto_record.model;

public class CursoDTO {
    private String nombreCurso;
    private int duracion;

    public CursoDTO(String nombreCurso, int duracion) {
        this.nombreCurso = nombreCurso;
        this.duracion = duracion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "CursoDTO{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}