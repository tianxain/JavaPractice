package example5;
class MaxPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		}
	}
}
class MinPriority implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		}
	}
}
public class example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread minPriority = new Thread(new MinPriority(),"优先级较低的线程");
        Thread maxPriority = new Thread(new MaxPriority(),"优先级较高的线程");
        minPriority.setPriority(Thread.MIN_PRIORITY);
        maxPriority.setPriority(Thread.MAX_PRIORITY);
        minPriority.setPriority(6);
        maxPriority.setPriority(7);
        maxPriority.start();
        minPriority.start();
	}

}
