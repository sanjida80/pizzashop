import java.awt.*;
import  java.util.*;

    public class Order {

        private String orderItem;
        private int orderId;
        private float orderTotal;

        //Constructor Method
        public Order(int orderId, String orderItem, float orderTotal) {
            this.orderId = orderId;
            this.orderItem = orderItem;
            this.orderTotal = orderTotal;
        }

        public static void listOrders(ArrayList<Order> oList) {
            for (Order order: oList) {
                System.out.println("Order Item: " + order.getOrderItem());
                System.out.println("Order Total: " + order.getOrderTotal());
            }
        }

        //Setters and Getters
        public int getorderId() { return orderId; }
        public void setorderId(int _orderId) {this.orderId = _orderId;}

        public String getOrderItem() { return orderItem; }
        public void setOrderItem(String orderItem) { this.orderItem = orderItem; }

        public float getOrderTotal() { return orderTotal; }
        public void setOrderTotal(float orderTotal) { this.orderTotal = orderTotal; }

    /* public double getTotalPrice(double unitTotal) {
        totalPrice = 0;
        totalPrice += unitTotal;
        return totalPrice;
    }

    public double getUnitTotal(double price, int quantity) {
        unitTotal = price * quantity;
        unitTotalPrice += unitTotal;
        return unitTotal;
    }

    public void printOrder(String menuItem, double unitTotal) {
        System.out.print(menuItem + "Total: " + unitTotal);
    } */

    }
