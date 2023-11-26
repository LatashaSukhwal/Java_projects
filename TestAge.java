class checkVote extends Exception 
{ 
 public checkVote (String eM) 
 { 
 super(eM); 
 } 
} 
public class TestAge 
{ 
 
 static void verify (int age) throws checkVote{ 
 if(age < 18){ 
 
 throw new checkVote("Age is less than 18, sorry can't vote."); 
 } 
 else { 
 System.out.println("You're eligible to vote."); 
 } 
 } 
 
 public static void main(String args[]) 
 { 

// user defined exception 
   
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 7; // try changing this value to see the exception
    
            try {
                
                System.out.println("Accessing element at index: " + index);
                System.out.println("Element at index " + index + " is: " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
  
    
 try 
 { 
 verify(15); 
 } 
 catch (checkVote M) 
 { 
 System.out.println("Caught the exception"); 
 
 System.out.println("An Exception occurred: " + M.getMessage()); 
 } 
 } 
}