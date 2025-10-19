// The first file of the project

import java.util.Random;

void main() {
    Random random = new Random();
    Double x = (double) random.nextInt(100) + 1;
    Double y = (double) random.nextInt(100) + 1;
    IO.println("x = " + x);
    IO.println("y = " + y);
    IO.println("x + y = " + (x + y));
    IO.println("x - y = " + (x - y));
    IO.println("x * y = " + (x * y));
    IO.println("x / y = " + (x / y));
    IO.println("x % y = " + (x % y));
}
