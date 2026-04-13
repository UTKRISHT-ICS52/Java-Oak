package mypack1;

public class Demo2 {
    public void show() {
        Demo1 d1 = new Demo1();

        // b is private → cannot access
        System.out.println(d1.a + d1.c + d1.d);
    }
}
