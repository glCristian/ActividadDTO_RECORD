package co.edu.uniquindio.poo.actividad_dto_record.Model;

public class EstudianteDTOUsandoRecord {
    private EstudianteRecord estudiante;

    /**
     * Constructor de la clase estudianteDTOUsandoRecord
     * @param estudiante
     */
    public EstudianteDTOUsandoRecord(EstudianteRecord estudiante) {
        this.estudiante = estudiante;
    }

    public EstudianteRecord getEstudiante() {
        return estudiante;
    }

    /**
     * Metodo toString de la clase estudianteDTOUsandoRecord
     * @return
     */
    @Override
    public String toString() {
        return "EstudianteDTOUsingRecord{" +
                "estudiante=" + estudiante +
                '}';
    }
}