import java.util.Random;

void main() {
    Random random = new Random();
    Integer[] numbers = new Integer[50];

    for (int i = 0; i < 50; i++) {
        numbers[i] = random.nextInt(100);
    }

    Integer[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
    Arrays.sort(sortedNumbers);

    System.out.println(Arrays.toString(sortedNumbers));
}