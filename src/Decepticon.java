public class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor = "red";
    private boolean kindness;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName=teamName;
        this.kindness = false;
    }

    public void transform() { System.out.println(getName() + " transforms into ground, air transport, weapon or equipment");}

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(Boolean kindness) {this.kindness = kindness;}

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {this.teamName=teamName;}
}