import java.util.List;
import java.util.Scanner;

public class EmployeeMenu 
{
    private UserManager userManager;
    private String username;

    public EmployeeMenu(UserManager userManager, String username) 
    {
        this.userManager = userManager;
        this.username = username;
    }

    public void showMenu() 
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
        {
            System.out.println("-----Menu-----\n1. Log worked hours\n2. View worked hours and salary\n3. Clear all entries and start over\n4. Log out\n\nChoose an option: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    logWorkedHours(scanner); 
                    break;
                case 2:
                    viewWorkedHoursAndSalary(); 
                    break;
                case 3:
                    clearEntries(); 
                    break;
                case 4:
                    exit = true;
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void logWorkedHours(Scanner scanner) 
    {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.next();

        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        TimeEntry entry = new TimeEntry(date, hoursWorked);
        userManager.addTimeEntry(username, entry);
        System.out.println("Worked hours logged successfully.");
    }

    private void viewWorkedHoursAndSalary() 
    {
        List<TimeEntry> entries = userManager.getEmployeeTimeEntries(username);
        if (entries == null || entries.isEmpty()) 
        {
            System.out.println("No records found for your worked hours.");
        } 
        else 
        {
            double totalSalary = 0.0;
            System.out.println("Worked Hours and Salary:");
            for (TimeEntry entry : entries) 
            {
                double salary = entry.getHoursWorked() * userManager.getHourlyRate(username);
                totalSalary += salary;
                System.out.println(entry + ", Salary: $" + salary);
            }
            System.out.println("Total Salary: $" + totalSalary);
        }
    }

    private void clearEntries() 
    {
        userManager.clearEmployeeEntries(username);
        System.out.println("All entries have been cleared.");
    }
}