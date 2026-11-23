package punto5.heroes;

import java.util.ArrayList;
import java.util.List;

public class Gremio {
    private String nombre;
    private List<Personaje> personajes;

    public Gremio(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje p) {
        if (p == null) {
            System.out.println("Error: el personaje no puede ser nulo.");
            return;
        }
        for (Personaje existente : personajes) {
            if (existente.getIdJugador() == p.getIdJugador()) {
                System.out.println("Error: ya existe un personaje con ID " + p.getIdJugador() + " en el gremio.");
                return;
            }
        }
        personajes.add(p);
        System.out.println("Personaje reclutado en " + nombre + ": " + p.getNombre() + " (\"" + p.getApodo() + "\")");
    }

    public void mostrarValorCombate() {
        System.out.println("\n=== REPORTE DE BATALLA - GREMIO: " + nombre + " ===");
        for (Personaje p : personajes) {
            System.out.printf("Héroe: %s (\"%s\") | Valor de combate: %.2f%n",
                    p.getNombre(), p.getApodo(), p.calcularValorCombate());
        }
        System.out.println("===================================================\n");
    }

    public Guerrero obtenerMejorGuerrero() {
        Guerrero mejorGuerrero = null;
        for (Personaje p : personajes) {
            if (p instanceof Guerrero) {
                Guerrero g = (Guerrero) p;
                if (mejorGuerrero == null || g.getVictoriasDuelo() > mejorGuerrero.getVictoriasDuelo()) {
                    mejorGuerrero = g;
                }
            }
        }
        return mejorGuerrero;
    }
}