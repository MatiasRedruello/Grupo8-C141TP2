package punto2.adapter;

public class BilleteraVirtual {
    public void realizarPago(String email, double monto) {
        System.out.println("Pago realizado desde billetera virtual (" + email + ") por $" + monto + ".");
    }
}