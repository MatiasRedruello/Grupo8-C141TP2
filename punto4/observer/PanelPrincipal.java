package punto4.observer;

public class PanelPrincipal implements IObservador {
    @Override
    public void actualizar(String tipoVariable, double valor, String unidad) {
        System.out.println("[Panel Principal] " + tipoVariable + ": " + valor + " " + unidad);
    }
}