import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        autobot optimusPrime = new autobot("Optimus Prime", "Autobots");
        decepticon megatron = new decepticon("Megatron", "Decepticons");
        System.out.println("=== " + optimusPrime.getName() + " ===");
        optimusPrime.run();
        optimusPrime.fire();
        optimusPrime.charge();
        optimusPrime.transform();
        System.out.println();
        System.out.println("=== " + megatron.getName() + " ===");
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
        System.out.println();
        List<transformer> transformers = new ArrayList();
        transformers.add(optimusPrime);
        transformers.add(megatron);
        System.out.println("=== Список трансформеров ===");

        for(transformer transformer : transformers) {
            System.out.println(transformer);
        }

    }
}
