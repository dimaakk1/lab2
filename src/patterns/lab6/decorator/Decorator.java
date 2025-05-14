package patterns.lab6.decorator;


public class Decorator {

    public static Runnable decorate(Runnable base, Runnable addition) {
        return () -> {
            base.run();
            addition.run();
        };
    }
}
