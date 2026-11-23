package punto2.adapter;

public class AdapterBilleteraVirtual implements IMedioPago {
    private BilleteraVirtual billeteraVirtual;

    public AdapterBilleteraVirtual(BilleteraVirtual billeteraVirtual) {
        this.billeteraVirtual = billeteraVirtual;
    }

    @Override
    public void pagar(Huesped huesped, double monto) {
        billeteraVirtual.realizarPago(huesped.getEmail(), monto);
    }
}