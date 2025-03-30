package co.edu.uniquindio.poo.actividad_dto_record.Model;

public class CursoDTO {
    private String nombreCurso;
    private int duracion;


    /**
     * Constructor de la clase CursoDTO
     * @param curso
     */
    public CursoDTO(Curso curso) {
        this.nombreCurso = curso.getNombre();
        this.duracion = curso.getDuracion();
    }


    /**
     * Metodo que obtiene el nombre del curso
     * @return
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * Metodo que establece el nombre del curso
     * @param nombreCurso
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * Metodo que obtiene la duracion del curso
     * @return
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Metodo que establece la duracion del curso
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Metodo toString
     * @return
     */
    @Override
    public String toString() {
        return "CursoDTO{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}