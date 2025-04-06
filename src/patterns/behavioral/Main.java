package patterns.behavioral;
import patterns.behavioral.chainOfResponsibility.*;
import patterns.behavioral.command.*;
import patterns.behavioral.iterator.*;
import patterns.behavioral.mediator.*;
import patterns.behavioral.observer.*;
import patterns.behavioral.strategy.*;
import patterns.behavioral.state.*;
import patterns.behavioral.templateMethod.*;
import patterns.behavioral.visitor.*;
import patterns.behavioral.memento.*;

public class Main {
    public static void main(String[] args) {
        // Chain of Responsibility
        Handler support = new SupportHandler();
        Handler billing = new BillingHandler();
        support.setNext(billing);
        support.handleRequest("billing");

        // Command
        OrderInvoker invoker = new OrderInvoker();
        invoker.setCommand(new OrderCommand());
        invoker.invoke();

        // Iterator
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct("Ноутбук");
        catalog.addProduct("Смартфон");
        Iterator iterator = catalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Товар: " + iterator.next());
        }

        // Mediator
        ChatMediator mediator = new ChatMediator();
        User user1 = new User("Андрій", mediator);
        User user2 = new User("Марія", mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        user1.sendMessage("Привіт, я хочу купити товар!");

        // Observer
        Store store = new Store();
        Customer customer1 = new Customer("Олег");
        Customer customer2 = new Customer("Ірина");
        store.addObserver(customer1);
        store.addObserver(customer2);
        store.notifyCustomers("Знижка 50% на всі товари!");

        // Strategy Pattern
        PaymentStrategy payment = new CreditCardPayment();
        payment.pay(50);

        // State Pattern
        Context context = new Context();
        context.setState(new StartState());
        context.request();

        // Template Method Pattern
        OrderProcessor order = new OnlineOrder();
        order.processOrder();

        // Memento
        Originator originator = new Originator();
        originator.setState("Стан 1");
        Memento savedState = originator.save();
        originator.setState("Стан 2");
        originator.restore(savedState);
        System.out.println("Відновлений стан: " + savedState.getState());

        // Visitor
        Product product = new Product();
        Visitor visitor = new DiscountVisitor();
        product.accept(visitor);

    }


}
