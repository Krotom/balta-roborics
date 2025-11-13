void main() {
    int oddSum = sumOfOddNumbers(100);
    IO.println("Sum of all odd numbers from 1 to 100: " + oddSum);

    int evenSum = sumOfEvenNumbers(100);
    IO.println("Sum of all even numbers from 1 to 100: " + evenSum);

    int factorial = calculateFactorial(5);
    IO.println("Factorial of 5: " + factorial);

    int multiplesOf3 = sumOfMultiples(100, 3);
    IO.println("Sum of multiples of 3 from 1 to 100: " + multiplesOf3);

    int primeCount = countPrimes(50);
    IO.println("Number of prime numbers from 1 to 50: " + primeCount);

    int fibSum = sumOfFibonacci(10);
    IO.println("Sum of first 10 Fibonacci numbers: " + fibSum);

    int squaresSum = sumOfSquares(10);
    IO.println("Sum of squares from 1 to 10: " + squaresSum);

    boolean isPerfect = isPerfectNumber(28);
    IO.println("Is 28 a perfect number? " + isPerfect);
}

int sumOfOddNumbers(int limit) {
    int sum = 0;
    for (int i = 1; i <= limit; i++) {
        if (i % 2 != 0) {
            sum += i;
        }
    }
    return sum;
}

int sumOfEvenNumbers(int limit) {
    int sum = 0;
    for (int i = 1; i <= limit; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    return sum;
}

int calculateFactorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

int sumOfMultiples(int limit, int multiple) {
    int sum = 0;
    for (int i = multiple; i <= limit; i += multiple) {
        sum += i;
    }
    return sum;
}

int countPrimes(int limit) {
    int count = 0;
    for (int i = 2; i <= limit; i++) {
        if (isPrime(i)) {
            count++;
        }
    }
    return count;
}

boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;

    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}

int sumOfFibonacci(int n) {
    int sum = 0;
    int a = 0, b = 1;

    for (int i = 0; i < n; i++) {
        sum += a;
        int temp = a + b;
        a = b;
        b = temp;
    }
    return sum;
}

int sumOfSquares(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i * i;
    }
    return sum;
}

boolean isPerfectNumber(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
    return sum == n;
}
