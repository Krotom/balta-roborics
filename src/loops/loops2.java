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

	for (int i = 0; i < n - 1; i++) {
		if (arr[i] != null && arr[i+1] != null && arr[i].equals(arr[i+1])) {
			arr[i+1] = null;
		}
	}
}

Integer[] compact_array(Integer @NotNull [] arr) {
	int count = 0;
	for (Integer num : arr) {
		if (num != null) {
			count++;
		}
	}

	Integer[] result = new Integer[count];
	int index = 0;
	for (Integer num : arr) {
		if (num != null) {
			result[index++] = num;
		}
	}

	return result;
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
    Integer[] uniqueSortedNumbers = compact_array(sortedNumbers2);

    IO.println("Bubble Sort Algoritması: " + Arrays.toString(uniqueSortedNumbers));

	IO.println("Original array length: " + sortedNumbers.length);
	IO.println("Unique array length: " + uniqueSortedNumbers.length);
}