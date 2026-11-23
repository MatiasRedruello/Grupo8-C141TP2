package punto5.heroes;

public class PersonajeDTO {
    private int idJugador;
    private String nombre;
    private String apodo;
    private int anioCreacion;
    private double poderAtaqueBase;
    private int victoriasDuelo;
    private double bonoPorVictoria;
    private double reservaMana;

    // Constructor para datos de Guerrero
    public PersonajeDTO(int idJugador, String nombre, String apodo, int anioCreacion,
                        double poderAtaqueBase, int victoriasDuelo, double bonoPorVictoria) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apodo = apodo;
        this.anioCreacion = anioCreacion;
        this.poderAtaqueBase = poderAtaqueBase;
        this.victoriasDuelo = victoriasDuelo;
        this.bonoPorVictoria = bonoPorVictoria;
    }

    // Constructor para datos de Mago
    public PersonajeDTO(int idJugador, String nombre, String apodo, int anioCreacion,
                        double reservaMana) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apodo = apodo;
        this.anioCreacion = anioCreacion;
        this.reservaMana = reservaMana;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public double getPoderAtaqueBase() {
        return poderAtaqueBase;
    }

    public int getVictoriasDuelo() {
        return victoriasDuelo;
    }

    public double getBonoPorVictoria() {
        return bonoPorVictoria;
    }

    public double getReservaMana() {
        return reservaMana;
    }
}