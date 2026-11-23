package punto1.strategy;

public class GestorTransacciones {
    private IEstrategiaOperacion estrategia;

    public void setEstrategia(IEstrategiaOperacion estrategia) {
        this.estrategia = estrategia;
    }

    public void confirmarTransaccion(double monto) {
        if (this.estrategia == null) {
            System.out.println("No se ha seleccionado ningún tipo de operación.");
            return;
        }
        this.estrategia.ejecutar(monto);
    }
}