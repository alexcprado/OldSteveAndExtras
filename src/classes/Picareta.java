package classes;

public class Picareta extends OldSteve {

    public Picareta(String material, int durabilidade, int forca) {
        super(material, durabilidade, forca);
    }

    public int getMaxDurabilidade() {
        switch (getMaterial().toLowerCase()) {
            case "madeira":
                return 50;
            case "pedra":
                return 70;
            case "ferro":
                return 100;
            case "ouro":
                return 30;
            default:
                return 60;
        }
    }
}