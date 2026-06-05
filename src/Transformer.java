public class Transformer {
    private String name;

    public Transformer(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void fire() {
        System.out.println(name + " is firing");
    }

    public void charge() {
        System.out.println(name + " is charging");
    }

    public String getName(){return name;}

    public void setName(String name) {this.name = name;}

}