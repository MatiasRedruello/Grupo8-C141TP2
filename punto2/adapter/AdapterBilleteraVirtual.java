package punto2.adapter;

public class AdapterBilleteraVirtual implements IMedioPago {
    private BilleteraVirtual billeteraVirtual;

    public AdapterBilleteraVirtual(BilleteraVirtual billeteraVirtual) {
        this.billeteraVirtual = billeteraVirtual;
    }

    @Override
    public void pagar(Huesped huesped, double monto) {
        validarPago(monto);
        billeteraVirtual.realizarPago(huesped.getEmail(), monto);
    }

    private void validarPago(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto del pago debe ser mayor a cero");
        };
    }
}