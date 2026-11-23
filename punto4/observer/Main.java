package punto4.observer;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de los sensores (Sujetos Concretos)
        Sensor sensorTemp = new SensorTemperatura();
        Sensor sensorHum = new SensorHumedad();
        Sensor sensorCO2 = new SensorCO2();
        Sensor sensorLuz = new SensorLuminosidad();

        // 2. Creación de las vistas/paneles 
        IObservador panelPrincipal = new PanelPrincipal();
        IObservador panelAlertas = new PanelAlertas(30.0, 70.0, 1000.0, 800.0);
        IObservador registroConsola = new RegistroConsola();

        // 3. Suscripción de observadores a los distintos sensores
        sensorTemp.suscribir(panelPrincipal);
        sensorTemp.suscribir(panelAlertas);
        sensorTemp.suscribir(registroConsola);

        sensorCO2.suscribir(panelPrincipal);
        sensorCO2.suscribir(panelAlertas);

        sensorHum.suscribir(panelPrincipal);
        sensorLuz.suscribir(registroConsola);

        // 4. Actualización de mediciones
        System.out.println("--- Lectura 1: Temperatura normal ---");
        sensorTemp.registrarValor(24.5);

        System.out.println("\n--- Lectura 2: CO2 supera umbral ---");
        sensorCO2.registrarValor(1250.0);

        // 5. Desuscripción dinámica en tiempo real
        System.out.println("\n--- Se desactiva el Panel de Alertas para Temperatura ---");
        sensorTemp.desuscribir(panelAlertas);

        System.out.println("\n--- Lectura 3: Temperatura alta (solo notificará a Principal y Consola) ---");
        sensorTemp.registrarValor(35.0);
    }
}