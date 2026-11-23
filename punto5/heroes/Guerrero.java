package punto5.heroes;

public class Guerrero extends Personaje {
    private double poderAtaqueBase;
    private int victoriasDuelo;
    private double bonoPorVictoria;

    public Guerrero(int idJugador, String nombre, String apodo, int anioCreacion,
                    double poderAtaqueBase, int victoriasDuelo, double bonoPorVictoria) {
        super(idJugador, nombre, apodo, anioCreacion);
        this.poderAtaqueBase = poderAtaqueBase;
        this.victoriasDuelo = victoriasDuelo;
        this.bonoPorVictoria = bonoPorVictoria;
    }

    @Override
    public double calcularValorCombate() {
        double fuerzaCalculada = victoriasDuelo * bonoPorVictoria;
        return Math.max(poderAtaqueBase, fuerzaCalculada);
    }

    public int getVictoriasDuelo() {
        return victoriasDuelo;
    }
}