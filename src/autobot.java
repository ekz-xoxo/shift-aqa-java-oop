public class autobot extends transformer {
    protected String teamName;
    protected final String eyeColor = "blue";
    protected boolean kindness;

    public autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.kindness = true;
    }

    public void transform() {
        System.out.println(name + " transforms into a vehicle");
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isKindness() {
        return kindness;
    }

    public String getTeamName() {
        return teamName;
    }
}