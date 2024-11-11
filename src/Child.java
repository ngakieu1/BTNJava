public class Parent {
    public Parent () {
        System.out.println("Parent");
    }
}
public class Child extends Parent {
    public Child() {
        System.out.println("Child");
    }
}
public void main(String[] args) {
        new Child();
    }

