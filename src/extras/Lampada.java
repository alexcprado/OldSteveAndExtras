package extras;

public class Lampada {

    private boolean ligada;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public boolean estaLigada() {
        return ligada;
    }

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        System.out.println(lampada.estaLigada());

        lampada.ligar();
        System.out.println(lampada.estaLigada());

        lampada.desligar();
        System.out.println(lampada.estaLigada());
    }
}
