public class autobot extends transformer implements action {
    protected String teamName;
    protected final String eyeColor = "blue";
    protected boolean kindness;

    public autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.kindness = true;
    }

    public void transform() {
        System.out.println(this.name + " transforms into a vehicle");
    }

    public void fire() {
        System.out.println(this.name + " is firing");
    }

    public void charge() {
        System.out.println(this.name + " is charging");
    }

    public String getEyeColor() {
        return "blue";
    }

    public boolean isKindness() {
        return this.kindness;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String toString() {
        return "Autobot: " + this.name;
    }
}