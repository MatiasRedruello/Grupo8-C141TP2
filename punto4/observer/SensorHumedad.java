package punto4.observer;

public class SensorHumedad extends Sensor {
    public SensorHumedad() {
        super("Humedad", "%");
    }

    @Override
    public void registrarValor(double nuevoValor) {
        if (nuevoValor < 0 || nuevoValor > 100) {
            throw new IllegalArgumentException("La humedad debe estar entre 0 y 100");
        };

        super.registrarValor(nuevoValor);
    }
}