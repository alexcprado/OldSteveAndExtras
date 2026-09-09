package classes;

public abstract class OldSteve {
    private String material;
    private int durablidade;
    private int forca;

    public OldSteve(String material, int durabilidade, int forca) {
        this.material = material;
        this.durablidade = durabilidade;
        this.forca = forca;
    }

    public String getMaterial() {

        return material;
    }

    public int getDurabilidade() {

        return durablidade;
    }

    public int getForca() {
        return forca;
    }

    public void setDurablidade(int durabilidade) {
        this.durablidade = durabilidade;
    }
}