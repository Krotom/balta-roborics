import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer x = random.nextInt(100) + 1;
        Integer y = random.nextInt(100) + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}