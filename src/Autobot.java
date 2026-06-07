public class Autobot extends Transformer implements Action {
    private String teamName;
    private final String eyeColor = "blue";
    private boolean kindness;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.kindness = true;
    }

    @Override
    public void transform() {
        System.out.println(getName() + " transforms into a vehicle");
    }

    @Override
    public void fire() {
        System.out.println(getName() + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(getName() + " is charging");
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
        return "Autobot: " + getName();
    }
}