package punto3.templatemethod;

public abstract class Personaje {
    protected String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    // Método plantilla 
    public final void combatir() {
        System.out.println("=== Inicio de combate de " + nombre + " ===");
        prepararEquipamiento();
        prepararAtaque();
        ejecutarAtaque();
        evaluarResultado();
        accionPostCombate();
        System.out.println("=== Fin de combate de " + nombre + " ===\n");
    }

    // Operaciones primitivas abstractas 
    protected abstract void prepararEquipamiento();
    protected abstract void prepararAtaque();
    protected abstract void ejecutarAtaque();

    // Paso común  para todos los personajes
    protected void evaluarResultado() {
        System.out.println(nombre + " evalúa el resultado del combate.");
    }

    // Hook 
    protected void accionPostCombate() {
        
    }
}