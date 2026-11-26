package punto4.observer;

public class SensorLuminosidad extends Sensor {
    public SensorLuminosidad() {
        super("Luminosidad", "lux");
    }

    @Override
    public void registrarValor(double nuevoValor) {
        if (nuevoValor < 0) {
            throw new IllegalArgumentException("La luminosidad no puede ser negativa");
        };

        super.registrarValor(nuevoValor);
    }
}