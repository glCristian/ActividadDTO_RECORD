package co.edu.uniquindio.poo;

public class UsuarioDTO {

    private String nombre;
    private String email;
    private int edad;

    public UsuarioDTO(Usuario usuario){
        this.nombre = usuario.getNombre();
        this.email = usuario.getEmail();
        this.edad = usuario.getEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                '}';
    }
}
