
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int first_option;

        do 
        {
            System.out.println("------ Menu ------\n1. Logged in as Emploee.\n2. Logged in as Admin.\n3. End program\n\nEnter your choice (1/2/3): ");

            while (!scan.hasNextInt()) 
            {
                System.out.print("Invalid input. Please enter an integer between 1 and 3: ");
                scan.next();
            }

            first_option = scan.nextInt();

            switch (first_option) 
            {
                case 1:
                    System.out.println("Logged in as Employee.");
                    break;
                case 2:
                    System.out.println("Logged in as Admin.");
                    break;
            }

        } 
        while (first_option != 3); 

        scan.close();
    }
}
