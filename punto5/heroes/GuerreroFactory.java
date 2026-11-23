package punto5.heroes;

public class GuerreroFactory implements IPersonajeFactory {
    @Override
    public Personaje crearPersonaje(PersonajeDTO dto) {
        return new Guerrero(
                dto.getIdJugador(),
                dto.getNombre(),
                dto.getApodo(),
                dto.getAnioCreacion(),
                dto.getPoderAtaqueBase(),
                dto.getVictoriasDuelo(),
                dto.getBonoPorVictoria()
        );
    }
}