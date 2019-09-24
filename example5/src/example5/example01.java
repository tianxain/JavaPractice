package example5;
class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println("run()");
		}
	}
}
public class example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           MyThread myThread=new MyThread(); 
           Thread thread=new Thread(myThread);
           thread.start();
           while(true) {
   			System.out.println("main()");
   		}
	}

}
