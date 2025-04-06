package patterns.behavioral.command;

public class OrderCommand implements Command {
    public void execute() {
        System.out.println("Оформлення замовлення");
    }
}
