public class TimeEntry 
{
  private String date;
  private double hoursWorked;

  public TimeEntry(String date, double hoursWorked) 
  {
      this.date = date;
      this.hoursWorked = hoursWorked;
  }

  public String getDate() 
  {
      return date;
  }

  public double getHoursWorked() 
  {
      return hoursWorked;
  }

  public String toString() 
  {
      return "Date: " + date + ", Hours Worked: " + hoursWorked;
  }
}
