import org.jetbrains.annotations.NotNull;

import java.util.Random;

void bubble_sort(Integer @NotNull [] arr) {
	int n = arr.length;
	for (int i = 0; i < n; i++) {
		boolean swap = false;
		for (int j = 0; j < n - i - 1; j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swap = true;
			}
		}
		if (!swap) {
			break;
		}
	}
}

void main() {
    Random random = new Random();
    Integer[] numbers = new Integer[50];

    for (int i = 0; i < 50; i++) {
        numbers[i] = random.nextInt(1000);
    }

    Integer[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
    Arrays.sort(sortedNumbers);
	
    IO.println("Arrays.sort: " + Arrays.toString(sortedNumbers));

	Integer[] sortedNumbers2 = Arrays.copyOf(numbers, numbers.length);
    bubble_sort(sortedNumbers2);

    IO.println("Bubble Sort Algoritması: " + Arrays.toString(sortedNumbers2));

	IO.println("Arrayler aynı mı: " + Arrays.equals(sortedNumbers, sortedNumbers2));
}
