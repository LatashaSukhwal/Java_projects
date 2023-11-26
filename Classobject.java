 //blue print and collection of object .in class defined variable (data member) and member function
 class Example{
    //declare variable
    //All are instance variable
    //syntax -datatype variable name;
    int emp_id;
    String name,dept;
    float salary;
    //method to intialize the variable
    void add_info(int id,String n,String d,float sal)// pass the variable in method parameter is local variable.
     // void add_info(int emp_id,String name,String dept,float salary)
    {
        // this.emp_id=emp_id;  // this is way to initialize the instance variable with the help this keyword point the current variable and instance variable 
        // this.name=name;
        // this.dept=dept;
        // this.salary=salary;


        //in these case it will confuse emp_id is local variable or instance variable so it will show null value 
        // emp_id=emp_id;  
        // name=name;
        // dept=dept;
        // salary=salary;

        //in these case local variable or instance varaiable name are different
        emp_id=id;  // this is way to initialize the instance variable 
        name=n;
        dept=d;
        salary=sal;
    }
    //method to display the employee detail
     void display()
     {
        System.out.println("Employee id="+emp_id);
        System.out.println("employee name="+name);
        System.out.println("Employee department="+dept);
        System.out.println("employee salary="+salary);
     }     


}
public class Classobject //public is access specifier, class is keyword,classobject is name of class 
{
    public static void main(String[] args) {
        
          //ceating the object of class Example
    Example E=new Example();
    //calling the method through the class instances
     E.add_info(101,"riya","CA",(float) 4560.0);
     E.display();

    }
  
}
