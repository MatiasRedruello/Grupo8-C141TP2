package punto4.observer;

public class RegistroConsola implements IObservador {
    @Override
    public void actualizar(String tipoVariable, double valor, String unidad) {
        System.out.println("[Registro Consola] Cambio detectado -> " + tipoVariable + " = " + valor + " " + unidad);
    }
}