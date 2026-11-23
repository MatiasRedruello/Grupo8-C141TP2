package punto5.heroes;

public class GestorHeroesFachada {
    private static GestorHeroesFachada instancia;
    private Gremio gremio;
    private IPersonajeFactory guerreroFactory;
    private IPersonajeFactory magoFactory;

    private GestorHeroesFachada() {
        this.gremio = new Gremio("Reinos de Algoria");
        this.guerreroFactory = new GuerreroFactory();
        this.magoFactory = new MagoFactory();
    }

    public static GestorHeroesFachada getInstancia() {
        if (instancia == null) {
            instancia = new GestorHeroesFachada();
        }
        return instancia;
    }

    public void reclutarGuerrero(PersonajeDTO dto) {
        Personaje guerrero = guerreroFactory.crearPersonaje(dto);
        gremio.agregarPersonaje(guerrero);
    }

    public void reclutarMago(PersonajeDTO dto) {
        Personaje mago = magoFactory.crearPersonaje(dto);
        gremio.agregarPersonaje(mago);
    }

    public Guerrero identificarMejorGuerrero() {
        return gremio.obtenerMejorGuerrero();
    }

    public void generarReporteBatalla() {
        gremio.mostrarValorCombate();
    }
}