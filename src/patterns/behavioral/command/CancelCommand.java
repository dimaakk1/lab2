package patterns.behavioral.command;

public class CancelCommand implements Command {
    public void execute() {
        System.out.println("Скасування замовлення");
    }
}