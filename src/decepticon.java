public class decepticon extends transformer implements action {
    protected String teamName;
    protected final String eyeColor = "red";
    protected boolean kindness;

    public decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.kindness = false;
    }

    public void transform() {
        System.out.println(this.name + " transforms into ground, air transport, weapon or equipment");
    }

    public void fire() {
        System.out.println(this.name + " is firing");
    }

    public void charge() {
        System.out.println(this.name + " is charging");
    }

    public String getEyeColor() {
        return "red";
    }

    public boolean isKindness() {
        return this.kindness;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String toString() {
        return "Decepticon: " + this.name;
    }
}