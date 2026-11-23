package punto5.heroes;

import java.time.Year;

public class Mago extends Personaje {
    private double reservaMana;

    public Mago(int idJugador, String nombre, String apodo, int anioCreacion, double reservaMana) {
        super(idJugador, nombre, apodo, anioCreacion);
        this.reservaMana = reservaMana;
    }

    @Override
    public double calcularValorCombate() {
        int antiguedad = calcularAntiguedad();
        if (antiguedad < 3) {
            return reservaMana;
        } else if (antiguedad <= 6) {
            return reservaMana * 1.04;
        } else {
            return reservaMana * 1.12;
        }
    }

    private int calcularAntiguedad() {
        return Year.now().getValue() - anioCreacion;
    }
}