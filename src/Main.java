import classes.FabricarPicareta;
import classes.Picareta;
import classes.Minerar;
import classes.Reparar;

public class Main {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS MANUAL         ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        Picareta p1 = FabricarPicareta.fabricar("madeira", 50, 5);
        Picareta p2 = FabricarPicareta.fabricar("pedra", 70, 8);
        Picareta p3 = FabricarPicareta.fabricar("ferro", 100, 12);

        System.out.println("\nPicaretas fabricadas:");
        System.out.println("  • " + p1.getMaterial() + " (D: " + p1.getDurabilidade() + ", F: " + p1.getForca() + ")");
        System.out.println("  • " + p2.getMaterial() + " (D: " + p2.getDurabilidade() + ", F: " + p2.getForca() + ")");
        System.out.println("  • " + p3.getMaterial() + " (D: " + p3.getDurabilidade() + ", F: " + p3.getForca() + ")");


        System.out.println("\n  Usando picaretas para minerar...");
        Minerar.minerar(p3, 30);
        Minerar.minerar(p3, 20);


        System.out.println("\n Criando picareta de ouro...");
        Picareta p4 = FabricarPicareta.fabricar("ouro", 30, 15);


        System.out.println("\n Reparando a picareta de ferro...");
        Reparar.reparar(p3, 50);

        System.out.println("\nEstado final das picaretas:");
        System.out.println("  • " + p1.getMaterial() + " (D: " + p1.getDurabilidade() + ", F: " + p1.getForca() + ")");
        System.out.println("  • " + p2.getMaterial() + " (D: " + p2.getDurabilidade() + ", F: " + p2.getForca() + ")");
        System.out.println("  • " + p3.getMaterial() + " (D: " + p3.getDurabilidade() + ", F: " + p3.getForca() + ")");
        System.out.println("  • " + p4.getMaterial() + " (D: " + p4.getDurabilidade() + ", F: " + p4.getForca() + ")");
    }
}