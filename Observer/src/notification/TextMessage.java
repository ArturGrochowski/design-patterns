package notification;

import order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("SMS - Order number: " + order.getOrderNumber() + ", current status: " + order.getOrderStatus());
    }
}
