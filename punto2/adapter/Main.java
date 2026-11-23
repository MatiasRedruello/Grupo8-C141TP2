package punto2.adapter;

public class Main {
    public static void main(String[] args) {
        Huesped huesped = new Huesped("Juan", "Pérez", "juan.perez@email.com", "4500-1234-5678-9010");
        Reserva reserva = new Reserva(huesped, 150000.0);

        // 1. Pago con Tarjeta de Crédito mediante su adaptador
        IMedioPago pagoTarjeta = new AdapterTarjetaCredito(new TarjetaCredito());
        reserva.pagarCon(pagoTarjeta);

        // 2. Pago con Billetera Virtual mediante su adaptador
        IMedioPago pagoBilletera = new AdapterBilleteraVirtual(new BilleteraVirtual());
        reserva.pagarCon(pagoBilletera);
    }
}