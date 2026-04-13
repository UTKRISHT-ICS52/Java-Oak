package mypack;

public class Demo {
    public void show() {
        System.out.println("Hello from package!");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
