package punto1.strategy;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void acreditar(double monto) {
        this.saldo += monto;
    }

    public void debitar(double monto) {
        this.saldo -= monto;
    }
}