// The first file of the project

import java.util.Random;

void main() {
    Random random = new Random();
    Double x = (double) random.nextInt(100) + 1;
    Double y = (double) random.nextInt(100) + 1;
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x % y = " + (x % y));
}