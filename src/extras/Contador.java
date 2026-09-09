package extras;

public class Contador {

    private static int valor = 0;

    public Contador() {
        valor++;
    }

    public static void zerar() {
        valor = 0;
    }

    public static void incrementar() {
        valor++;
    }

    public static int retornarValor() {
        return valor;
    }

    public static void main(String[] args) {

        Contador.zerar();

        System.out.println("Contador: " + Contador.retornarValor());

        Contador c1 =  new Contador();

        System.out.println("Contador: " + Contador.retornarValor());

        Contador c2 = new Contador();

        System.out.println("Contador: " + Contador.retornarValor());

        Contador.incrementar();

        System.out.println("Contador: " + Contador.retornarValor());
    }
}
