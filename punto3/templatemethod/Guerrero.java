package punto3.templatemethod;

public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    protected void prepararEquipamiento() {
        System.out.println(nombre + " prepara el arma y equipa la armadura.");
    }

    @Override
    protected void prepararAtaque() {
        System.out.println(nombre + " se acerca al enemigo.");
    }

    @Override
    protected void ejecutarAtaque() {
        System.out.println(nombre + " ejecuta un ataque físico.");
    }
}