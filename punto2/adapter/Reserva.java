package punto2.adapter;

public class Reserva {
    private Huesped huesped;
    private double montoTotal;

    public Reserva(Huesped huesped, double montoTotal) {
        this.huesped = huesped;
        this.montoTotal = montoTotal;
    }

    public void pagarCon(IMedioPago medio) {
        medio.pagar(this.huesped, this.montoTotal);
    }
}