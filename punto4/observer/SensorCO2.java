package punto4.observer;

public class SensorCO2 extends Sensor {
    public SensorCO2() {
        super("Nivel de CO2", "ppm");
    }

    @Override
    public void registrarValor(double nuevoValor) {
        if (nuevoValor < 0) {
            throw new IllegalArgumentException("El nivel de CO2 no puede ser negativo");
        };

        super.registrarValor(nuevoValor);
    }
}