@SuppressWarnings("ConstantValue")
void main() {
    String str = "Hello, World!";

    System.out.println("Original String: " + str);

    // Length of the string
    System.out.println("Length of the string: " + str.length());

    // Convert to uppercase
    System.out.println("Uppercase: " + str.toUpperCase());

    // Convert to lowercase
    System.out.println("Lowercase: " + str.toLowerCase());

    // Substring
    System.out.println("Substring (0, 5): " + str.substring(0, 5));

    // Replace
    System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

    // Trim
    System.out.println("Trimmed: " + str.trim());

    // CharAt
    System.out.println("Char at index 0: " + str.charAt(0));

    // CharAt Lowercase
    System.out.println("Char at index 0 (lowercase): " + str.toLowerCase().charAt(0));

    // CharAt Uppercase
    System.out.println("Char at index 0 (uppercase): " + str.toUpperCase().charAt(0));

    // Contains 'Hello'
    System.out.println("Contains 'Hello': " + str.contains("Hello"));

}