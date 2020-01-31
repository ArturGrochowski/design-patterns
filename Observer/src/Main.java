import notification.Email;
import notification.MobileApp;
import notification.TextMessage;
import order.Order;
import order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(110L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order1.registerObserver(textMessage);
        order1.registerObserver(mobileApp);
        order1.registerObserver(email);

        order1.notifyObservers();
        System.out.println("-----------------------");
        order1.changeOrderStatus(OrderStatus.SHIPPED);
        order1.unregisterObserver(email);
        System.out.println("________________________");
        order1.changeOrderStatus(OrderStatus.RECIVED);
    }
}
