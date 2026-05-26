public interface action {
    String getName();

    default void run() {
        System.out.println(this.getName() + " is running");
    }

    void fire();

    void charge();
}
