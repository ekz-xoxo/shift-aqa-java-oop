import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autobot optimusPrime = new Autobot("Optimus Prime", "Autobots");
        Decepticon megatron = new Decepticon("Megatron", "Decepticons");
        System.out.println("=== " + optimusPrime.getName() + " ===");
        System.out.println("Team: " + optimusPrime.getTeamName());
        System.out.println("Eye color: " + optimusPrime.getEyeColor());
        System.out.println("Kindness: " + optimusPrime.isKindness());
        optimusPrime.run();
        optimusPrime.fire();
        optimusPrime.charge();
        optimusPrime.transform();
        System.out.println();
        System.out.println("=== " + megatron.getName() + " ===");
        System.out.println("Team: " + megatron.getTeamName());
        System.out.println("Eye color: " + megatron.getEyeColor());
        System.out.println("Kindness: " + megatron.isKindness());
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
        System.out.println();
        List<Transformer> transformers = new ArrayList();
        transformers.add(optimusPrime);
        transformers.add(megatron);
        System.out.println("=== Список трансформеров ===");

        for(Transformer transformer : transformers) {
            System.out.println(transformer);
        }

    }
}
