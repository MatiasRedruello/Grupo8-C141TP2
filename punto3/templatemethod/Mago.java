package punto3.templatemethod;

public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    protected void prepararEquipamiento() {
        System.out.println(nombre + " selecciona un hechizo y prepara el bastón.");
    }

    @Override
    protected void prepararAtaque() {
        System.out.println(nombre + " concentra energía mágica.");
    }

    @Override
    protected void ejecutarAtaque() {
        System.out.println(nombre + " ejecuta un ataque mágico.");
    }

    @Override
    protected void accionPostCombate() {
        System.out.println(nombre + " medita para recuperar energía mágica.");
    }
}