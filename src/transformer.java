public abstract class transformer {
    protected String name;

    public transformer(String name) {
        this.name = name;
    }

    public abstract void transform();

    public String getName() {
        return "Transformer " + this.name;
    }
}
