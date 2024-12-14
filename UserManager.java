import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class UserManager 
{
    private HashMap<String, String> employeeCredentials;
    private HashMap<String, List<TimeEntry>> employeeTimeEntries;
    private HashMap<String, Double> employeeHourlyRates; 

    public UserManager() 
    {
        employeeCredentials = new HashMap<>();
        employeeTimeEntries = new HashMap<>();
        employeeHourlyRates = new HashMap<>();
    }

    public boolean validateEmployeeLogin(String username, String password) 
    {
        return employeeCredentials.containsKey(username) && employeeCredentials.get(username).equals(password);
    }

    public List<TimeEntry> getEmployeeTimeEntries(String username) 
    {
        return employeeTimeEntries.get(username);
    }

    public Map<String, List<TimeEntry>> getAllEmployeeTimeEntries() 
    {
        return employeeTimeEntries;
    }

    public void addTimeEntry(String username, TimeEntry entry) 
    {
        employeeTimeEntries.get(username).add(entry);
    }

    public double getHourlyRate(String username) 
    {
        return employeeHourlyRates.get(username);
    }

    public void updateHourlyRate(String username, double newRate) 
    {
        employeeHourlyRates.put(username, newRate);
    }

    public void addEmployee(String username, String password, double hourlyRate) 
    {
        if (!employeeCredentials.containsKey(username)) 
        {
            employeeCredentials.put(username, password);
            employeeTimeEntries.put(username, new ArrayList<>());
            employeeHourlyRates.put(username, hourlyRate);
        } 
        else 
        {
            System.out.println("Employee already exists!");
        }
    }

    public void removeEmployee(String username) 
    {
        employeeCredentials.remove(username);
        employeeTimeEntries.remove(username);
        employeeHourlyRates.remove(username);
    }

    public void clearEmployeeEntries(String username) 
    {
        employeeTimeEntries.put(username, new ArrayList<>());
    }
}