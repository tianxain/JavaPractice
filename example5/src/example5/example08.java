package example5;
class SleepThread implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(3==i) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				}
			System.out.println("�߳�һ�������:  "+i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}
public class example08 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
           new Thread(new SleepThread()).start();
           for(int i=1;i<=10;i++) {
        	   if(5==i) {
        		   Thread.sleep(2000);
        	   }
        	   System.out.println("���߳��������:  "+i);
        	   Thread.sleep(500);
           }
	}

}
