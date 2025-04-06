package patterns.behavioral.state;

public class StartState implements State {
    public void handle() {
        System.out.println("Стан: Початок");
    }
}

