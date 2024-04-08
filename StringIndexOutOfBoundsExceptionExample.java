package Task.Task_11;

public class StringIndexOutOfBoundsExceptionExample  {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            // Attempting to access a character at an index beyond the string's length
            char character = str.charAt(10);
            System.out.println("Character at index 10: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error: String index is out of bounds.");
        }
    }
}
