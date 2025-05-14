package patterns.lab6.executeAround;

import java.util.function.Consumer;

public class executeAround {

    public static void greetUser(Consumer<executeAround> block) {
        System.out.println("Привіт!");

        block.accept(new executeAround());

        System.out.println("Бувай!");
    }

    public void say(String message) {
        System.out.println(message);
    }
}
