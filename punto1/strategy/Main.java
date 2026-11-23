package punto1.strategy;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria(500.0);

        GestorTransacciones gestor = new GestorTransacciones();

        // 1.Depósito
        gestor.setEstrategia(new Deposito(cuenta1));
        gestor.confirmarTransaccion(500.0);

        // 2.SSe selecciona Extracción, luego se cambia a Transferencia
        gestor.setEstrategia(new Extraccion(cuenta1));
        gestor.setEstrategia(new Transferencia(cuenta1, cuenta2));
        gestor.confirmarTransaccion(300.0);

        // 3.Extracción
        gestor.setEstrategia(new Extraccion(cuenta1));
        gestor.confirmarTransaccion(200.0);
    }
}