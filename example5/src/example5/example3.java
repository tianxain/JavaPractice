package example5;
class Ticket implements Runnable{
	private int tickets=1000;
	public void run() {
		while(true) {
			saleTicket();
			if(0>=tickets) {
			break;}
		}
  }
private synchronized void saleTicket() {
		if(tickets>0) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
			}
		}
	}
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket=new Ticket();
        new Thread(ticket,"线程1").start();
        new Thread(ticket,"线程2").start();
        new Thread(ticket,"线程3").start();
        new Thread(ticket,"线程4").start();
	}

}
