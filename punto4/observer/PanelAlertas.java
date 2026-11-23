package punto4.observer;

public class PanelAlertas implements IObservador {
    private double umbralTemperatura;
    private double umbralHumedad;
    private double umbralCO2;
    private double umbralLuminosidad;

    public PanelAlertas(double umbralTemp, double umbralHum, double umbralCO2, double umbralLum) {
        this.umbralTemperatura = umbralTemp;
        this.umbralHumedad = umbralHum;
        this.umbralCO2 = umbralCO2;
        this.umbralLuminosidad = umbralLum;
    }

    @Override
    public void actualizar(String tipoVariable, double valor, String unidad) {
        if (superaUmbral(tipoVariable, valor)) {
            System.out.println("[Panel de Alertas] ¡ALERTA! " + tipoVariable + " superó el umbral permitido: " + valor + " " + unidad);
        }
    }

    private boolean superaUmbral(String tipoVariable, double valor) {
        switch (tipoVariable) {
            case "Temperatura":
                return valor > umbralTemperatura;
            case "Humedad":
                return valor > umbralHumedad;
            case "Nivel de CO2":
                return valor > umbralCO2;
            case "Luminosidad":
                return valor > umbralLuminosidad;
            default:
                return false;
        }
    }
}