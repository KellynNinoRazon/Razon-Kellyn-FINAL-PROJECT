import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdminMenu 
{
    private UserManager userManager;

    public AdminMenu(UserManager userManager) 
    {
        this.userManager = userManager;
    }

    public void showMenu() 
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
        {
            System.out.println("-----Menu-----\n1. View all employees' total salary and hourly rate\n2. Search for a specific employee's record\n3. Change hourly rate for an employee\n4. Add a new employee\n5. Erase an employee\n6. Log out\n\nChoose an option: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    viewAllEmployees();
                    break;
                case 2:
                    searchEmployeeRecord(scanner);
                    break;
                case 3:
                    changeHourlyRate(scanner); 
                    break;
                case 4:
                    addEmployee(scanner); 
                    break;
                case 5:
                    eraseEmployee(scanner); 
                    break;
                case 6:
                    exit = true; 
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

   
    private void viewAllEmployees() 
    {
        Map<String, List<TimeEntry>> allEmployeesTimeEntries = userManager.getAllEmployeeTimeEntries();

        if (allEmployeesTimeEntries.isEmpty()) 
        {
            System.out.println("No employees found.");
        } 
        else 
        {
            System.out.println("Employee List: ");
            for (String employee : allEmployeesTimeEntries.keySet()) 
            {
                List<TimeEntry> entries = allEmployeesTimeEntries.get(employee);
                double totalSalary = 0.0;
                for (TimeEntry entry : entries) 
                {
                    totalSalary += entry.getHoursWorked() * userManager.getHourlyRate(employee);
                }
                double hourlyRate = userManager.getHourlyRate(employee);
                System.out.println("Employee: " + employee + ", Total Salary: $" + totalSalary + ", Hourly Rate: $" + hourlyRate);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to go back to the menu (1) or search for an employee's record (2)? ");
        int choice = scanner.nextInt();

        if (choice == 1) 
        {
            return; 
        } 
        else if (choice == 2) 
        {
            searchEmployeeRecord(scanner); 
        }
    }

    private void searchEmployeeRecord(Scanner scanner) 
    {
        System.out.print("Enter the username of the employee: ");
        String employeeUsername = scanner.next();

        List<TimeEntry> employeeEntries = userManager.getEmployeeTimeEntries(employeeUsername);
        if (employeeEntries == null || employeeEntries.isEmpty()) 
        {
            System.out.println("No records found for " + employeeUsername);
        } 
        else 
        {
            double totalSalary = 0.0;
            System.out.println(employeeUsername + "'s Records:");
            for (TimeEntry entry : employeeEntries) 
            {
                double salary = entry.getHoursWorked() * userManager.getHourlyRate(employeeUsername);
                totalSalary += salary;
                System.out.println(entry + ", Salary: $" + salary);
            }
            System.out.println("Total Salary: $" + totalSalary);
        }
    }

    private void changeHourlyRate(Scanner scanner) 
    {
        System.out.print("Enter the username of the employee whose hourly rate you want to change: ");
        String employeeUsername = scanner.next();

        if (userManager.getEmployeeTimeEntries(employeeUsername) == null) 
        {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter the new hourly rate for " + employeeUsername + ": $");
        double newHourlyRate = scanner.nextDouble();

        userManager.updateHourlyRate(employeeUsername, newHourlyRate);

        System.out.println("The hourly rate for " + employeeUsername + " has been updated to $" + newHourlyRate);
    }

    private void addEmployee(Scanner scanner) 
    {
        System.out.print("Enter the new employee's username: ");
        String username = scanner.next();

        if (userManager.getEmployeeTimeEntries(username) != null) 
        {
            System.out.println("An employee with this username already exists.");
            return;
        }

        System.out.print("Enter the new employee's password: ");
        String password = scanner.next();

        System.out.print("Enter the new employee's hourly rate: $");
        double hourlyRate = scanner.nextDouble();

        userManager.addEmployee(username, password, hourlyRate);

        System.out.println("New employee " + username + " added successfully.");
    }

    private void eraseEmployee(Scanner scanner) 
    {
        System.out.print("Enter the username of the employee you want to erase: ");
        String username = scanner.next();

        if (userManager.getEmployeeTimeEntries(username) == null) 
        {
            System.out.println("Employee not found.");
            return;
        }

        userManager.removeEmployee(username);

        System.out.println("Employee " + username + " has been removed from the system.");
    }
}