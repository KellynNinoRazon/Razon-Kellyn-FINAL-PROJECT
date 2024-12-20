import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        UserManager userManager = new UserManager();

        userManager.addEmployee("Fatima", "FatimaPass", 30.0);
        userManager.addEmployee("Kellyn", "Kellz", 20.0);
        userManager.addEmployee("Marlou", "Marlz", 25.0);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
        {
            System.out.println("'Welcome to Salary ExpectanSee'\n------ Menu ------\n1. Log in as Employee.\n2. Log in as Admin.\n3. End program\n\nEnter your choice (1/2/3):");
            String role = scanner.nextLine();

            if (role.equals("2")) 
            {
                System.out.print("Enter admin username: ");
                String username = scanner.nextLine();
                System.out.print("Enter admin password: ");
                String password = scanner.nextLine();

                if (userManager.validateEmployeeLogin(username, password)) 
                {
                    AdminMenu adminMenu = new AdminMenu(userManager);
                    adminMenu.showMenu();
                } 
                else 
                {
                    System.out.println("Invalid credentials.");
                }
            } 
            else if (role.equals("1")) 
            {
                System.out.print("Enter employee username: ");
                String username = scanner.nextLine();
                System.out.print("Enter employee password: ");
                String password = scanner.nextLine();

                if (userManager.validateEmployeeLogin(username, password)) 
                {
                    EmployeeMenu employeeMenu = new EmployeeMenu(userManager, username);
                    employeeMenu.showMenu();
                } 
                else 
                {
                    System.out.println("Invalid credentials.");
                }
            } 
            else 
            {
                System.out.println("Invalid role. Please try again.");
            }
        }
        scanner.close();
    }
}
