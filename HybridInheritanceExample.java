class Grandfather
{
    void methodgrandfather()
    {
        System.out.println("GrandFather");
    }
}
class Father extends Grandfather
{
    void methodfather()
    {
        System.out.println("Father");
    }
}
class Son extends Father
{
    void methodSon()
    {
        System.out.println("Son");
    }
}
class Daughter extends Father
{
    void methodDaughter()
    {
        System.out.println("Daughter");
    }
}


public class HybridInheritanceExample {
    
    public static void main(String[] args)
    {
        //crete the object of sub class
        Father F=new Father();
        Son S=new Son();
        Daughter D=new Daughter();
        //call the method of superclass(GrandFather) through subclass object
        F.methodgrandfather();
        S.methodgrandfather();
        D.methodgrandfather();
        //call the method of superclass(Father)  through subclass object
       
        S.methodfather();
        D.methodfather();

           
    }
}
