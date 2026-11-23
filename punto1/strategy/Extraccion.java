package punto1.strategy;

public class Extraccion implements IEstrategiaOperacion {
    private CuentaBancaria cuenta;

    public Extraccion(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void ejecutar(double monto) {
        if (!validarImporte(monto)) {
            System.out.println("Error en extracción: el importe solicitado no es válido.");
            return;
        }
        if (!verificarSaldoSuficiente(monto)) {
            System.out.println("Error en extracción: saldo insuficiente.");
            return;
        }
        cuenta.debitar(monto);
        System.out.println("Extracción exitosa de $" + monto + ". Saldo actual: $" + cuenta.getSaldo());
    }

    private boolean validarImporte(double monto) {
        return monto > 0;
    }

    private boolean verificarSaldoSuficiente(double monto) {
        return cuenta.getSaldo() >= monto;
    }
}