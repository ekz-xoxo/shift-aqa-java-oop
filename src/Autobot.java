public class Autobot extends Transformer {
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

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(String kindness) {this.kindness = Boolean.parseBoolean(kindness);}

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {this.teamName=teamName;}
}