package stage02.main;

import stage02.service.OrderService;
import stage02.service.PaypalGateway;

public class Test10_DependencyInjection {
    public static void main(String[] args) {
        //| 10 | Dependency Injection (лайт) | Класс OrderService принимает в конструкторе PaymentGateway gateway.
        // В main создайте OrderService и передайте туда new PaypalGateway(). |
        workOrderService();
    }

    public static void workOrderService(){
        OrderService orderService = new OrderService(new PaypalGateway(0));
        System.out.println(orderService);
    }
}
