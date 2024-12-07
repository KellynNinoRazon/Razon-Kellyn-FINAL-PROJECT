import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginSystem {

    // List to store User objects
    private static List<User> userDatabase = new ArrayList<>();

    public static void AdminMenu() 
    {
        Scanner scan2 = new Scanner(System.in);

        
        System.out.println("------ Menu ------\n1. Show employees.\n2. Add new employees.\n3. Validate working hours\n4. Exit\n\nEnter your choice (1/2/3/4): ");
        int admin_option = scan2.nextInt();
        while (!scan2.hasNextInt()) 
        {
            System.out.print("Invalid input. Please enter an integer between 1 and 4: ");
            scan2.next();
        }

        admin_option = scan2.nextInt();

        switch (admin_option) 
        {
            case 1:
                System.out.println("Show Employees.");
                break;
            case 2:
                System.out.println("Logged in as Admin.");
                break;
            case 3:
                System.out.println("Logged in as Employee.");
                break;
            case 4:
                System.out.println("Admin logging out...");
                break;
        }

        scan2.close();
    }

    // Method for logging in
    private static void login(Scanner scan2) {
        System.out.print("Enter Username: ");
        String enteredUsername = scan2.nextLine();

        System.out.print("Enter Password: ");
        String enteredPassword = scan2.nextLine();

        // Validate the username and password
        if (isValidLogin(enteredUsername, enteredPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Method for creating a new account
    private static void createAccount(Scanner scan2) {
        System.out.print("Enter a new Username: ");
        String newUsername = scan2.nextLine();

        // Check if the username already exists
        if (usernameExists(newUsername)) {
            System.out.println("Username already exists. Please choose a different one.");
        } else {
            System.out.print("Enter a new Password: ");
            String newPassword = scan2.nextLine();

            // Store the new account in the list
            userDatabase.add(new User(newUsername, newPassword));
            System.out.println("Account created successfully!");
        }
    }

    // Method to check if the username already exists
    private static boolean usernameExists(String username) {
        for (User user : userDatabase) {
            if (user.getUsername().equals(username)) {
                return true;  // Username exists
            }
        }
        return false;  // Username does not exist
    }

    // Method to validate login credentials
    private static boolean isValidLogin(String username, String password) {
        for (User user : userDatabase) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;  // Found matching credentials
            }
        }
        return false;  // No matching credentials found
    }
}

// Class to represent a user
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
