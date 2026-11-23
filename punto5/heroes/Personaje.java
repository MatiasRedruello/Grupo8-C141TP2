package punto5.heroes;

public abstract class Personaje {
    protected int idJugador;
    protected String nombre;
    protected String apodo;
    protected int anioCreacion;

    public Personaje(int idJugador, String nombre, String apodo, int anioCreacion) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apodo = apodo;
        this.anioCreacion = anioCreacion;
    }

    public abstract double calcularValorCombate();

    public int getIdJugador() {
        return idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }
}