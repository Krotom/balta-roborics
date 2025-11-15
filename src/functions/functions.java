void main() {
    for (int num = 1; num <= 30; num++) {
        if (isPrime(num)) {
            int digitSum = sumOfDigits(num);
            IO.println("Prime: " + num + " | Digit Sum: " + digitSum + " | Is Perfect: " + isPerfect(digitSum));
        }
    }

    IO.println("\n=== Checking Numbers 1-100 ===\n");

    for (int i = 1; i <= 100; i++) {
        int digits = sumOfDigits(i);

        if (isPrime(digits)) {
            IO.println(i + " has prime digit sum: " + digits);
        }

        if (isPerfect(i)) {
            IO.println(i + " is a perfect number! Digit sum: " + digits);
        }
    }

    IO.println("\n=== Special Number Combinations ===\n");

    int count = 0;
    for (int n = 1; n <= 200; n++) {
        int digitSum = sumOfDigits(n);
        if (isPrime(n) && isPrime(digitSum)) {
            count++;
            IO.println("Double Prime: " + n + " (digit sum: " + digitSum + ")");
        }
    }

    IO.println("\nTotal double primes found: " + count);
}

int sumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
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

boolean isPerfect(int n) {
    if (n <= 1) return false;
    int sum = 0;
    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }
    return sum == n;
}
