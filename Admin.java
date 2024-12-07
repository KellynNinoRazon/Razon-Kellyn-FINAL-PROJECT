/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginSystem 
{
    public class loginSystem {

    private static List<Employee> userDatabase = new ArrayList<>();
        Scanner scan2 = new Scanner(System.in);

        do 
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
                    System.out.println("Logged in as Employee.");
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

        } 
        }

        scan2.close();
    
}

private static void login(Scanner scan2) 
{
    System.out.print("Enter Username: ");
    String user = scan2.nextLine();
    System.out.print("Enter Password: ");
    String pass = scan2.nextLine();

        if (isValidLogin(user, pass)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
}

private static boolean isValidLogin(String username, String password) 
{
    return USERNAME.equals(username) && PASSWORD.equals(password);
}

private static void createAccount(Scanner scanner) {
    System.out.print("Enter a new Username: ");
    String newUsername = scan2.nextLine();

    // Check if the username already exists
    if (usernameExists(newUsername)) {
        System.out.println("Username already exists. Please choose a different one.");
    } else {
        System.out.print("Enter a new Password: ");
        String newPassword = scanner.nextLine();

        // Store the new account in the list
        userDatabase.add(new User(newUsername, newPassword));
        System.out.println("Account created successfully!");
    }
}*/