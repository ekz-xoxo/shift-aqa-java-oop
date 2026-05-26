public class decepticon extends transformer{
    protected String teamName;
    protected final String eyeColor = "red";
    protected boolean kindness;

    public decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.kindness = false;
    }

    public void transform() {
        System.out.println(name + " transforms into ground, air transport, weapon or equipment");
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