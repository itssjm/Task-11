package Task.Task_11;

    import java.util.Scanner;

public class LoginSystem {
    private static final String CORRECT_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            login(username, password);
            System.out.println("Login successful!");
            // Proceed with other actions after successful login
        } catch (InvalidPasswordException e) {
            System.err.println("Error: Incorrect password entered.");
            // Optionally, you can prompt the user to try again or take other actions
        } finally {
            scanner.close();
        }
    }

    public static void login(String username, String password) throws InvalidPasswordException {
        if (!password.equals(CORRECT_PASSWORD)) {
            throw new InvalidPasswordException();
        }
        // Authenticate user if needed
    }
}

class InvalidPasswordException extends Exception {
    // Custom exception class for invalid password
}

