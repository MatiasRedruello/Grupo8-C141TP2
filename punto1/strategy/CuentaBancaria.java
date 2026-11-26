package punto1.strategy;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        validarSaldoInicial(saldoInicial);

        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void acreditar(double monto) {
        validarMonto(monto);
        this.saldo += monto;
    }

    public void debitar(double monto) {
        validarMonto(monto);
        validarDebito(monto);
        this.saldo -= monto;
    }

    private void validarMonto(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero");
        };
    }

    private void validarDebito(double monto) {
        if (monto > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar el debito");
        };
    }

    private void validarSaldoInicial(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        };
    }
}