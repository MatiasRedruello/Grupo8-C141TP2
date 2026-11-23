package punto5.heroes;

public class MagoFactory implements IPersonajeFactory {
    @Override
    public Personaje crearPersonaje(PersonajeDTO dto) {
        return new Mago(
                dto.getIdJugador(),
                dto.getNombre(),
                dto.getApodo(),
                dto.getAnioCreacion(),
                dto.getReservaMana()
        );
    }
}