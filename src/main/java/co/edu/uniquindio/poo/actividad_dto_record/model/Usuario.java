package co.edu.uniquindio.poo.actividad_dto_record.model;

public class Usuario {

    private String nombre;
    private String email;
    private int edad;
    private String contrasena;

    public Usuario(String nombre, String email, int edad, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.contrasena = contrasena;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
