package punto2.adapter;

public class Huesped {
    private String nombre;
    private String apellido;
    private String email;
    private String numeroTarjeta;

    public Huesped(String nombre, String apellido, String email, String numeroTarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
}