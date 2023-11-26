public class MultithreadingExample1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        private final String threadName;

        MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        public void run() {
          //  try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Running " + threadName + ", count: " + i);
                    Thread.sleep(1000); // Sleep for 1 second
             //   }
          //  } catch (InterruptedException e) {
            //    System.out.println(threadName + " interrupted.");
            }
            System.out.println(threadName + " exiting.");
        }
    }
}
