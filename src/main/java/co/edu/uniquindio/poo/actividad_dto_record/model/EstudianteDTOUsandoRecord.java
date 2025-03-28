package co.edu.uniquindio.poo.actividad_dto_record.model;

public class EstudianteDTOUsandoRecord {
    private EstudianteRecord estudiante;

    public EstudianteDTOUsandoRecord(EstudianteRecord estudiante) {
        this.estudiante = estudiante;
    }

    public EstudianteRecord getEstudiante() {
        return estudiante;
    }

    @Override
    public String toString() {
        return "EstudianteDTOUsingRecord{" +
                "estudiante=" + estudiante +
                '}';
    }
}