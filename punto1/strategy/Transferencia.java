package punto1.strategy;

public class Transferencia implements IEstrategiaOperacion {
    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;

    public Transferencia(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void ejecutar(double monto) {
        if (monto <= 0) {
            System.out.println("Error en transferencia: el importe debe ser mayor a cero.");
            return;
        }
        if (!verificarSaldoSuficiente(monto)) {
            System.out.println("Error en transferencia: saldo insuficiente en la cuenta de origen.");
            return;
        }
        cuentaOrigen.debitar(monto);
        cuentaDestino.acreditar(monto);
        System.out.println("Transferencia exitosa de $" + monto
                + ". Saldo origen: $" + cuentaOrigen.getSaldo()
                + " | Saldo destino: $" + cuentaDestino.getSaldo());
    }

    private boolean verificarSaldoSuficiente(double monto) {
        return cuentaOrigen.getSaldo() >= monto;
    }
}