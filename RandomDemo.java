import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random r1 = new Random();
        int i = 0;
        while(i<5){
            int random = r1.nextInt();
            System.out.println(random);
            i++;
        }
}
}
