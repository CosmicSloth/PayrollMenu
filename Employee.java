
public abstract class Employee
{
   private String name;
   private int id;
   private String jobTitle;

   public Employee(String name, int id, String jobTitle) {
      name = "";
   }
         
  
   public String getName() {
      return name; 
   }
   public void setName(String name) {
	   this.name = name;
   }
   
   
  public int getId() {
	  return id;
  }
   public void setId(int id) {
	   this.id=id;
   }
   
   
  public String getJobTitle() {
	  return jobTitle;
  }
  public void setJobTitle(String jobTitle) {
	  this.jobTitle = jobTitle;
  }
   

  public void display() {
	 
	            System.out.println();
	            System.out.println(" Name: " + name);
	            System.out.println(" ID : " + id);
	            System.out.println(" Job Title :" + jobTitle);
	}

	
  
  
  
  
   
   public abstract double weeklyPay();

	
}

