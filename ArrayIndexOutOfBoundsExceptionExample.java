package Task.Task_11;

public class ArrayIndexOutOfBoundsExceptionExample  {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            // Accessing an element at an index beyond the array's length
            int element = array[5];
            System.out.println("Element at index 5: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index is out of bounds.");
        }
    }
}
