package punto5.heroes;

public class Main {
    public static void main(String[] args) {
        // Dos gremios o módulos acceden al gestor central único (Singleton)
        GestorHeroesFachada gestorGremioNorte = GestorHeroesFachada.getInstancia();
        GestorHeroesFachada gestorGremioSur = GestorHeroesFachada.getInstancia();


        // Reclutamiento mediante la Fachada usando DTOs
        gestorGremioNorte.reclutarGuerrero(
                new PersonajeDTO(1, "Arthur", "El León", 2021, 150.0, 10, 25.0)
        );
        gestorGremioNorte.reclutarGuerrero(
                new PersonajeDTO(2, "Leonidas", "Escudo de Hierro", 2023, 200.0, 4, 30.0)
        );
        gestorGremioSur.reclutarMago(
                new PersonajeDTO(3, "Merlín", "El Sabio", 2018, 500.0)
        );
        gestorGremioSur.reclutarMago(
                new PersonajeDTO(4, "Lyra", "Chispa Arcana", 2025, 300.0)
        );

        // Generación de reporte de batalla desde la Fachada
        gestorGremioNorte.generarReporteBatalla();

        // Consulta del mejor guerrero desde la Fachada
        Guerrero mejor = gestorGremioSur.identificarMejorGuerrero();
        if (mejor != null) {
            System.out.println("Mejor Guerrero: " + mejor.getNombre()
                    + " (\"" + mejor.getApodo() + "\") con "
                    + mejor.getVictoriasDuelo() + " victorias en duelo.");
        }
    }
}