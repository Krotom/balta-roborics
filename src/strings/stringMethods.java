@SuppressWarnings("ConstantValue")
void main() {
    String str = "Hello, World!";

    IO.println("Original String: " + str);

    // Length of the string
    IO.println("Length of the string: " + str.length());

    // Convert to uppercase
    IO.println("Uppercase: " + str.toUpperCase());

    // Convert to lowercase
    IO.println("Lowercase: " + str.toLowerCase());

    // Substring
    IO.println("Substring (0, 5): " + str.substring(0, 5));

    // Replace
    IO.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

    // Trim
    IO.println("Trimmed: " + str.trim());

    // CharAt
    IO.println("Char at index 0: " + str.charAt(0));

    // CharAt Lowercase
    IO.println("Char at index 0 (lowercase): " + str.toLowerCase().charAt(0));

    // CharAt Uppercase
    IO.println("Char at index 0 (uppercase): " + str.toUpperCase().charAt(0));

    // Contains 'Hello'
    IO.println("Contains 'Hello': " + str.contains("Hello"));

}
