public class Autobot extends Transformer implements Action {
    private String teamName;
    private final String eyeColor = "blue";
    private boolean kindness;

    public Autobot(String name, String teamName) {
        super(name);
        setTeamName(teamName);
        setKindness("true");
    }

    public void transform() {
        System.out.println(getName() + " transforms into a vehicle");
    }

    public void fire() {
        System.out.println(getName() + " is firing");
    }

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

    public void setKindness(String kindness) {
        this.kindness = Boolean.parseBoolean(kindness);
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Autobot: " + getName();
    }
}