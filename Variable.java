public class Variable {
/* -----Instance variable(object variable) ---- 
 1.declare instance variable inside the class but outside the method.
 2.by default is 0 value intialized in instance vaiable whenever you
   not intialize the value in instance variable
 3.by default access mode is default. 
 4.you can define any access mode(default,public,protected,private)to instance variable. 
 5.every object is own copy of instance variable.
   not share single copy and memory to all the object
 6. Access and call through the object reference(create the object of the class)
     object.variablename;
     this.variablename;  
*/

/*-------Static variable----

1.static keyword is used defined the static variable. 
2.by default value is 0
3.access specifier is allow to declare the static varible.by default is default specifier type variable.
syntax->
        acess_specifier datatype variable;
examle->
         private static int a;         
4.share single memory to all object 
5.no need of object reference to call or access the static variable.
6.can be access through the class name
  classname.variablename;
7.only one static variable declared in all the class.  

 */


/*----local variable-----

1.local variable deaclared and intialized inside the method of the class.
2.ther no defalut value .
3.not declared through the acess specifier.
4. it is necessay to intialize the value given the method  

 */

int a;
int b=20;
static int c=23; 

//by default is 0 value assign 


void display()
{   int d; 
    int e=11;
    System.out.println("instance variable ->b="+b+'\n'); 
    //variable d might not have been initialized
   // System.out.println("d="+d); //value is not intailaze in vaiable it will show the error .it does not contain any default value
    
   System.out.println("static variable ->c="+c+'\n');
     System.out.println("local variablr -> e="+e+'\n'); 
    e++;
    c++;
    b++;
}
// System.out.println("hello");-> you can print any thing outside the method ,print inside the method
public static void main(String[] args)
{     //create the object of class
      Variable V=new Variable();
      Variable V1=new Variable();
      
      //System.out.println(a); non-static variable a cannot be referenced from a static context
      // access instance variable through the object -> V.variablename 
      System.out.println("a="+V.a);
     
      //static variable can be access without oject reference.can acess by classname.variablename; 
      System.out.println(c);
      System.out.println("c="+Variable.c);

      System.out.println( "1 object  through call the diaplay method\n");
      V.display();
      System.out.println( "2 object  through call the diaplay method\n");
      V1.display(); //c value is incremebted by 1 but not b

      //after incremented the b by 1
      System.out.println( "1 object  through call the diaplay method again\n");
      V.display(); //b is incremented or c also
       System.out.println( "2 object  through call the diaplay method again\n");
      V1.display(); //b is incremented or c also
}

}
