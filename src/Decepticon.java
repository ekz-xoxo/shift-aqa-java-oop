public class Decepticon extends Transformer implements Action {
    protected String teamName;
    protected final String eyeColor = "red";
    protected boolean kindness;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.kindness = false;
    }

    @Override
    public void transform() {
        System.out.println(getName() + " transforms into ground, air transport, weapon or equipment");
    }

    @Override
    public void fire() {
        System.out.println(getName() + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(getName()+ " is charging");
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public boolean isKindness() {
        return this.kindness;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setKindness(Boolean kindness) {
        this.kindness = kindness;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Decepticon: " + getName();
    }
}