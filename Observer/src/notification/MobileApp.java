package notification;

import order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("MobileApp - Order number: " + order.getOrderNumber() + ", current status: " + order.getOrderStatus());
    }
}
