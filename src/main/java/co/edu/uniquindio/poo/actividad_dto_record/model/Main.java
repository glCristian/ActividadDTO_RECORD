package co.edu.uniquindio.poo.actividad_dto_record.model;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante0 = new Estudiante("JJ", 89, "0987654321");

        EstudianteDTO dto = new EstudianteDTO(estudiante0);

        EstudianteRecord record = new EstudianteRecord(estudiante0.getNombre(), estudiante0.getEdad());

        EstudianteDTOUsandoRecord dtoRecord = new EstudianteDTOUsandoRecord(record);


        System.out.println(dto);

        System.out.println(record);

    }
}