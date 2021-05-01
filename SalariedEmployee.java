
public class SalariedEmployee extends Employee
{
   private double annualSalary;

   public SalariedEmployee(String name, int id, String jobTitle,  double salary)
   {
	  super(name, id, jobTitle);
      setName(name);
      setId(id);
      setJobTitle(jobTitle);
      annualSalary = salary;
 
   }

   public double weeklyPay() 
   {
      final int WEEKS_PER_YEAR = 52;
      return annualSalary / WEEKS_PER_YEAR;
   }
}
