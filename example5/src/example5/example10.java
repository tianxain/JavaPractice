package example5;
class EmergencyThread implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName()+"����: "+i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}
public class example10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread t=new Thread(new EmergencyThread(),"�߳�һ");
		t.start();
           for(int i=1;i<=5;i++) {
        	   System.out.println(Thread.currentThread().getName()+"����: "+i);
        	   if(2==i) {
        		   t.join();
        	   }
        	   Thread.sleep(500);
           }
	}

}