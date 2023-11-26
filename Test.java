class VoteCheck extends Exception
{
    public VoteCheck(String eM)
    {
        super(eM);
    }
} 
class Test{
  static void checkage(int age) throws VoteCheck
  {
     if(age<18)
      throw new VoteCheck("age is less than 18 so you are not eligible");
     else
      System.out.print("eligible"); 
  }
 public static void main(String[] args)
  {
     // Test t=new Test();
      try{
      checkage(15);
      }
      catch(VoteCheck M)
      {
         System.out.println("caught the exception");
         System.out.println("exception occur:"+M.getMessage());
      }
  }
}
