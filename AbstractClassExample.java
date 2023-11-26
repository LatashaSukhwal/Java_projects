abstract class Employee
{
    String name;
    int employeeId;
    void  Employeeinfo(String name,int employeeId)
    {
        this.name=name;
        this.employeeId=employeeId;
    }
   abstract void calculateSalary();
}
class FullTimeEmployee extends Employee
{   
   double Salary;
  
   FullTimeEmployee(String name,int employeeId,double Salary)
   {
    super(name,employeeId);
    this.Salary=Salary;
   }
    @Override
   public double calculateSalary()
   {
    // System.out.println("Salary of full time employee is ");
    return Salary;
   }
}
class PartTimeEmployee extends Employee{
    double HourRate,HourWorked;
    PartTimeEmployee(String name,int employeeId,double HourRate,double HourWorked)
    {
           super(name,employeeId);
           this.HourRate=HourRate;
           this.HourWorked=HourWorked;
    }
   @Override
    public double calculateSalary()
   {
    // System.out.println("Salary of full time employee is ");
    return Salary;
   }
}
class AbstractClassExample
{
    public static void main(String[] args )
    {
        PartTimeEmployee P=new PartTimeEmployee();
      
        FullTimeEmployee F=new FullTimeEmployee();
        P.calculateSalary();
     
        F.calculateSalary();
   
    }
}