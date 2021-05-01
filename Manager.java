
public class Manager extends SalariedEmployee
{
   private double weeklyBonus;

   public Manager(String name, int id,  String jobTitle, double salary, double bonus)
   {
      super(name, id, jobTitle, salary);
      weeklyBonus = bonus;
   }

   public double weeklyPay()
   {
      return super.weeklyPay() + weeklyBonus;
   }
}


