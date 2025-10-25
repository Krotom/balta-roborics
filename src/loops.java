import java.util.Random;

void main() {
    Random random = new Random();
    Integer[] numbers = new Integer[50];

    for (int i = 0; i < 50; i++) {
        numbers[i] = random.nextInt(1000);
    }

    Integer[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
    Arrays.sort(sortedNumbers);

    IO.println(Arrays.toString(sortedNumbers));
}