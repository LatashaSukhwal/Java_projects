import java.util.Scanner;
class Vehical
{
    String make;
    String model;
    void vehical_info(String make ,String model)
    {
        this.make=make;
        this.model=model;
    }
    void displayVehicalInfo()
    {
        System.out.println("make="+make);
        System.out.println("model="+model);

    }
}
class Car extends Vehical{
    int year;
    void car_info(int year)
    {
        this.year=year;
    }
    void displayCarInfo()
    {
        System.out.println("year="+year);

    }
}
class PracticalQ
{ public static void main(String args[])
    { 
    Scanner sc=new Scanner(System.in);
    Car C=new Car();
    Car C2=new Car();

    String make,model;
    int year;
    
    // put the value by user
    System.out.println("enter make,model,year");
    make=sc.nextLine();
    model=sc.nextLine();
    year=sc.nextInt();
    C.vehical_info(make,model);
    C.car_info(year);
    C.displayVehicalInfo();
    C.displayCarInfo();

    //put the value bydefault
    C2.vehical_info("Toyota","Camry");
    C2.car_info(2022);
    C2.displayVehicalInfo();
    C2.displayCarInfo();
}
}