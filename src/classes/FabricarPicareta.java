package classes;

public class FabricarPicareta extends OldSteve {

    public FabricarPicareta(String material, int durabilidade, int forca) {
        super(material, durabilidade, forca);
    }

    public static Picareta fabricar (String material, int durabilidade, int forca) {
        System.out.println("\n=== FABRICANDO PICARETA ===");
        System.out.println("Material: " + material);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Força: " + forca);

        if (durabilidade <= 0 || forca <= 0) {
            System.out.println(" Picareta inválida!");
            return null;
        }

        System.out.println("Picareta de " + material + " fabricada com sucesso!");

        return new Picareta(material, durabilidade, forca);
    }
}