package patterns.behavioral.chainOfResponsibility;

public class SupportHandler implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public void handleRequest(String request) {
        if (request.equals("support")) {
            System.out.println("Обробка запиту підтримки");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
