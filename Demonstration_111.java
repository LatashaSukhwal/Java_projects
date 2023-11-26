// public class MultithreadingExample {
//     public static void main(String[] args) {
//         MyThread thread1 = new MyThread("Thread 1");
//         MyThread thread2 = new MyThread("Thread 2");

//         thread1.start();
//         thread2.start();
//     }

//     static class MyThread extends Thread {
//         private final String threadName;

//         MyThread(String threadName) {
//             this.threadName = threadName;
//         }

//         public void run() {
//             try {
//                 for (int i = 0; i < 5; i++) {
//                     System.out.println("Running " + threadName + ", count: " + i);
//                     Thread.sleep(1000); // Sleep for 1 second
//                 }
//             } catch (InterruptedException e) {
//                 System.out.println(threadName + " interrupted.");
//             }
//             System.out.println(threadName + " exiting.");
//         }
//     }
// }
/* Creating three threads using the class Thread and then running them concurrently. */
class ThreadA implements Runnable{
     public void run( ) {
        for(int i = 1; i <= 2; i++) {
           System.out.println("From Thread A with i = "+ -1*i);
        }
        //System.out.println("Exiting from Thread A ...");
     }
}

class ThreadB implements Runnable {
    public void run( ) {
       for(int j = 1; j <= 2; j++) {
         System.out.println("From Thread B with j= "+2* j);
       }
       //System.out.println("Exiting from Thread B ...");  
	}
}


public class Demonstration_111 {
    public static void main(String args[]) {

         ThreadA a = new ThreadA();
         Thread t1=new Thread(a);
         ThreadB b = new ThreadB();
         Thread t2=new Thread(b);
         
         t1.start();
         t2.start();
     
    }
}