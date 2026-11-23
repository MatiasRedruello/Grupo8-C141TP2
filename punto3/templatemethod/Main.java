package punto3.templatemethod;

public class Main {
    public static void main(String[] args) {
        Personaje guerrero = new Guerrero("Aragorn");
        Personaje mago = new Mago("Gandalf");

        guerrero.combatir();
        mago.combatir();
    }
}