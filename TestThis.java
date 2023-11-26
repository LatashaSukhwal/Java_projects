class Student
{
    int rollno;
    String name;
    Float fee;
public Student(int i, String s,Float k) {
    rollno=i;
        name=s;
        fee=k;
    }
    //     public Student(int rollno,String name,Float fee) {
//         this.rollno=rollno;
//   this. name=name;
//    this.fee=fee;
//     }
    // void Student(int i ,String n,Float t ){
      //  it assign null value because instance variable and parameter are same that case compilor is confused
        // rollno=rollno;
        // name=name;
        // fee=fee;
        
//  }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class TestThis{
    public static void main(String[] args){
 Student s=new Student(101,"riya",(float)5000);
   s.display();
    }
   
}