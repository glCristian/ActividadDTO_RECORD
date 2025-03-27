package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Usuario usuario0 = new Usuario("Cristian", "cristianc.bonillap@uqvirtual.edu.co", 18, "123456789");

        UsuarioDTO dto = new UsuarioDTO(usuario0);

        UsuarioRecord record = new UsuarioRecord(usuario0.getNombre(), usuario0.getEmail(), usuario0.getEdad());

        System.out.println(record.nombre() + " " + record.edad() + " " + dto.getEmail());

    }
}