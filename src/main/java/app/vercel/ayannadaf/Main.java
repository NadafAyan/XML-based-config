package app.vercel.ayannadaf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        OrderService order = context.getBean(OrderService.class);

        order.placeOrder();
    }
}

