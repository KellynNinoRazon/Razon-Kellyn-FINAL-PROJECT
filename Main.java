import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    private static List<String> Employees = new ArrayList<>();
    public static void main(String[] args) 
    {
        Employees.add("K");
        Scanner scan = new Scanner(System.in);
        int main_option;

        try
        {
            while (true) 
            {
            
                System.out.println("------ Menu ------\n1. Logged in as Employee.\n2. Logged in as Admin.\n3. End program\n\nEnter your choice (1/2/3): ");
                main_option = scan.nextInt();

                switch (main_option) 
                {
                    case 1:
                        EmployeeLogin(scan);
                        break;
                    case 2:
                        AdminMenu(scan);
                        break;
                    default:
                        System.out.println("Invalid input. Please enter an integer between 1 and 2");
                        break;
                }
            }
        }
        finally 
        {
            scan.close();
        }


    }

    public static void EmployeeLogin(Scanner scan)
    {
        
        String name;
        String password;

        while (true) 
        {
            
            System.out.print("Name:");
            name=scan.next();

            if (Employees.contains(name))
            {
                System.out.print(" Password: ");
                password=scan.next();

            }

            else
            {
                System.out.print("Wrong credentials.");
                return;
            }
        }
    }

    public static void EmployeeMenu(Scanner scan)
    {
        int employee_option;

        while (true)
        {
            System.out.println("------ Menu ------\n1. Show Trackings.\n2. Insert worked hours.\n3. Logout\n\nEnter your choice (1/2/3): ");
            employee_option = scan.nextInt();

            switch (employee_option) 
            {
                case 1:
                    System.out.println("Print all logs");
                    break;
                case 2:
                    System.out.println("Add work hours");
                    break;
                case 3:
                    System.out.println("Loging out...");
                    return;
                default:
                    System.out.println("Invalid input. Please enter an integer between 1 and 2");
                    break;
            }

        }
    }

    public static void AdminMenu(Scanner scan)
    {
        int admin_option;

        while (true) 
        {
            System.out.println("------ Menu ------\n1. Show Employee list.\n2. Add an Employee.\n3. Set hourly rate\n4.Give comments\n5. Logout\n\nEnter your choice (1/2/3/4/5): ");

            admin_option = scan.nextInt();

            switch (admin_option) 
            {
                case 1:
                    System.out.println("Show all employees");
                    break;
                case 2:
                    System.out.println("Add employee");
                break;
                case 3:
                    System.out.println("Set hourlyRate");
                    break;
                case 4:
                    System.out.println("Give comment");
                    break;
                case 5:
                    System.out.println("Logout");
                    return;
                default:
                    System.out.println("Invalid input. Please enter an integer between 1 and 2");
                    break;
            }

        }
    
    }
}
