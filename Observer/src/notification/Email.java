package notification;

import order.Order;

public class Email implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("Email - Order number: " + order.getOrderNumber() + ", current status: " + order.getOrderStatus());
    }
}
