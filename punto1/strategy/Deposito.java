package punto1.strategy;

public class Deposito implements IEstrategiaOperacion {
    private CuentaBancaria cuenta;

    public Deposito(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void ejecutar(double monto) {
        if (validarImporte(monto)) {
            cuenta.acreditar(monto);
            System.out.println("Depósito exitoso de $" + monto + ". Saldo actual: $" + cuenta.getSaldo());
        } else {
            System.out.println("Error en depósito: el importe debe ser mayor a cero.");
        }
    }

    private boolean validarImporte(double monto) {
        return monto > 0;
    }
}