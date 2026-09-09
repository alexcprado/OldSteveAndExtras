package classes;

public class Reparar {
    public static void reparar(Picareta picareta, int quantidade) {
        System.out.println("\n=== REPARANDO PICARETA DE " + picareta.getMaterial().toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + picareta.getDurabilidade());
        System.out.println("Quantidade a reparar: " + quantidade);

        int durabilidadeNova = picareta.getDurabilidade() + quantidade;
        int limiteMaximo = picareta.getMaxDurabilidade();

        if (durabilidadeNova > limiteMaximo) {
            System.out.println(" Reparo limitado a " + limiteMaximo);
            durabilidadeNova = limiteMaximo;
        }

        picareta.setDurablidade(durabilidadeNova);

        System.out.println("Durabilidade nova: " + picareta.getDurabilidade());
    }
}