import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

class Order {
    private String name;
    private double price;

    public Order(){

    }
    public Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class OrderCounter {

    static int count(Iterable<Order> orders) {
        int total = 0;
        for (Order _ : orders)    //Su dung bien khong ten
            total++;
        return total;
    }

    public static void main(String[] args) {
        // Tao mot list cac orders
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Laptop", 999.99));
        orders.add(new Order("Phone", 599.99));
        orders.add(new Order("Tablet", 299.99));

        // Dem so luong cac orders
        int totalOrders = count(orders);

        // Dua ra tong so luong cac orders
        System.out.println("Tong so luong cac orders: " + totalOrders);

        List<OrderCounter> orderCounters = List.of(new OrderCounter(), new OrderCounter(), new OrderCounter());
        orderCounters.forEach(_ -> System.out.println("Don hang duoc dat"));
//        for(Order _ : orders) {
//            _.showInfo();
//            System.out.println();
//        }
    }
}
