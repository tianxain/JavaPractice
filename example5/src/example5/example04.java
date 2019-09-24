package example5;
class TicketWindow implements Runnable{
	private int tickets=10;
	Object lock=new Object();
	public void run() {
		while(true) {
			synchronized(lock) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(0<tickets) {
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
			}
			else
			{
				break;
				}
			}
		}
	}
}
//class DamonThread implements Runnable{
	//public void run() {
		///while(true) {
			//System.out.println(Thread.currentThread().getName()+"---is running!");
		//}
	//}
//}
public class example04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("main线程是后台线程吗？"+Thread.currentThread().isDaemon());
		//DamonThread dt=new DamonThread();
		//Thread t=new Thread(dt,"后台线程");
		//System.out.println("t线程默认是后台线程吗？"+t.isDaemon());
		//t.setDaemon(true);
		//t.start();
		//for(int i=0;i<10;i++) {
		//	System.out.println(i);
		//}
		TicketWindow window=new TicketWindow();
        new Thread(window,"窗口1").start();
        new Thread(window,"窗口2").start();
        new Thread(window,"窗口3").start();
        new Thread(window,"窗口4").start();
	} 
}



