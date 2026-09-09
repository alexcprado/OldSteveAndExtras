package classes;

public class Minerar {

    public static void minerar (Picareta picareta, int blocos) {
        System.out.println("\n=== MINERANDO COM PICARETA DE " + picareta.getMaterial().toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + picareta.getDurabilidade());
        System.out.println("Força: " + picareta.getForca());
        System.out.println("Blocos a minerar: " + blocos);

        int blocosMinerados = 0;

        for (int i = 0; i < blocos; i++) {

            if (picareta.getDurabilidade() <= 0) {
                System.out.println("Quebrando o bloco..." + (i + 1));
                break;
            }
            picareta.setDurablidade(picareta.getDurabilidade() - 1);
            blocosMinerados++;
        }

        System.out.println("\nMinerados " + blocosMinerados + " blocos");
        System.out.println("Durabilidade restante: " + picareta.getDurabilidade());

        if (picareta.getDurabilidade() <= 0) {
            System.out.println("A picareta de " + picareta.getMaterial() + " quebrou!");
        }
    }
}