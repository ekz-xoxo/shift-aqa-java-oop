public class Main {
    public static void main(String[] args) {

        Autobot optimusPrime = new Autobot("Optimus Prime", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");

        System.out.println("=== Autobot: " + optimusPrime.getName() + " ===");
        System.out.println("Team: " + optimusPrime.getTeamName());
        System.out.println("Eye color: " + optimusPrime.getEyeColor());
        System.out.println("Kindness: " + optimusPrime.isKindness());
        optimusPrime.run();
        optimusPrime.fire();
        optimusPrime.charge();
        optimusPrime.transform();

        System.out.println("\n=== Decepticon: " + megatron.getName() + " ===");
        System.out.println("Team: " + megatron.getTeamName());
        System.out.println("Eye color: " + megatron.getEyeColor());
        System.out.println("Kindness: " + megatron.isKindness());
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
    }
}