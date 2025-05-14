package patterns.lab6;
import patterns.lab6.decorator.*;
import patterns.lab6.executeAround.*;
import patterns.lab6.strategy.*;
import patterns.lab6.factory.*;

import static patterns.lab6.factory.Factory.createProduct;


public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Картка
        context.setPaymentStrategy(amount ->
                System.out.println("Оплата карткою: " + amount + " USD"));
        context.pay(100);

        // Крипта
        context.setPaymentStrategy(amount ->
                System.out.println("Оплата Криптою: " + amount));
        context.pay(250);

        // Product A
        Product productA = createProduct("A");
        productA.use();

        // Product B
        Product productB = createProduct("B");
        productB.use();

        // Decorator
        Runnable baseOrder = () -> System.out.println("Обробка базового замовлення");

        // Додаємо подарункове пакування
        Runnable withGiftWrap = Decorator.decorate(baseOrder,
                () -> System.out.println("Додано подарункове пакування"));

        // Додаємо персональне повідомлення
        Runnable fullOrder = Decorator.decorate(withGiftWrap,
                () -> System.out.println("Додано персональне повідомлення"));
        fullOrder.run();

        //Execute Around

        executeAround.greetUser(greeter -> {
            greeter.say("Мене звати Дмитро.");
            greeter.say("Радий тебе бачити!");
        });
    }
}
