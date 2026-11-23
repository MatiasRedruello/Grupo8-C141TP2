package punto4.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    protected String tipoVariable;
    protected String unidadMedida;
    protected double valorActual;
    private List<IObservador> observadores;

    public Sensor(String tipoVariable, String unidadMedida) {
        this.tipoVariable = tipoVariable;
        this.unidadMedida = unidadMedida;
        this.observadores = new ArrayList<>();
    }

    public void suscribir(IObservador observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void desuscribir(IObservador observador) {
        observadores.remove(observador);
    }

    protected void notificarObservadores() {
        for (IObservador observador : observadores) {
            observador.actualizar(tipoVariable, valorActual, unidadMedida);
        }
    }

    public void registrarValor(double nuevoValor) {
        this.valorActual = nuevoValor;
        notificarObservadores();
    }

    public String getTipoVariable() {
        return tipoVariable;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public double getValorActual() {
        return valorActual;
    }
}