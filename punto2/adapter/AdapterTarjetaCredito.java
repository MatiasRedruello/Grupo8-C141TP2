package punto2.adapter;

public class AdapterTarjetaCredito implements IMedioPago {
    private TarjetaCredito tarjetaCredito;

    public AdapterTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    @Override
    public void pagar(Huesped huesped, double monto) {
        if (tarjetaCredito.validarLimite(huesped.getNumeroTarjeta(), monto)) {
            tarjetaCredito.autorizarCargo(huesped.getNumeroTarjeta(), monto);
        } else {
            System.out.println("Error: límite insuficiente en la tarjeta de crédito.");
        }
    }
}