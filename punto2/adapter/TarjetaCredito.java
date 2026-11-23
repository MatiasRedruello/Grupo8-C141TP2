package punto2.adapter;

public class TarjetaCredito {
    public boolean validarLimite(String numeroTarjeta, double monto) {
        System.out.println("Validando límite disponible para tarjeta " + numeroTarjeta + " por $" + monto + "...");
        return monto > 0 && monto <= 500000.0;
    }

    public void autorizarCargo(String numeroTarjeta, double monto) {
        System.out.println("Cargo autorizado por $" + monto + " en la tarjeta " + numeroTarjeta + ".");
    }
}