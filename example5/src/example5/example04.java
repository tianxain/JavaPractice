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
				System.out.println(Thread.currentThread().getName()+"���ڷ��۵�"+tickets--+"��Ʊ");
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
		//System.out.println("main�߳��Ǻ�̨�߳���"+Thread.currentThread().isDaemon());
		//DamonThread dt=new DamonThread();
		//Thread t=new Thread(dt,"��̨�߳�");
		//System.out.println("t�߳�Ĭ���Ǻ�̨�߳���"+t.isDaemon());
		//t.setDaemon(true);
		//t.start();
		//for(int i=0;i<10;i++) {
		//	System.out.println(i);
		//}
		TicketWindow window=new TicketWindow();
        new Thread(window,"����1").start();
        new Thread(window,"����2").start();
        new Thread(window,"����3").start();
        new Thread(window,"����4").start();
	} 
}



