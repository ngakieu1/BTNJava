public class Computer {
    public String name;
    protected String ID;
    float price;
    public Computer() {
    }
    public Computer(String name, String ID, float price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
    }
}
