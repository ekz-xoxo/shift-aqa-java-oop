public abstract class Transformer {
    private String name;

    public Transformer(String name) {
        setName(name);
    }

    public abstract void transform();

    public String getName() {
        return "Transformer " + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
