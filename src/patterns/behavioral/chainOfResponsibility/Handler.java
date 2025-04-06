package patterns.behavioral.chainOfResponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}