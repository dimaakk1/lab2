package patterns.behavioral.chainOfResponsibility;

public class BillingHandler implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public void handleRequest(String request) {
        if (request.equals("billing")) {
            System.out.println("Обробка запиту платежу");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}