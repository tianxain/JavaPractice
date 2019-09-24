package example5;

class Storage {
	private int[] cells = new int[10];
	private int inPos, outPos;
	private int count;

	public synchronized void put(int num) {
		try {
			while (cells.length == count) {
				this.wait();
			}
			cells[inPos] = num;
			System.out.println("在cells[" + inPos + "]中放入数据---" + cells[inPos]);
			inPos++;
			if (cells.length == inPos) {
				inPos = 0;
			}
			count++;
			this.notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void get() {
		try {
			while (0 == count) {
				this.wait();
			}
			int data = cells[outPos];
			System.out.println("从cells[" + outPos + "]中取出数据---" + data);
			outPos++;
			if (cells.length == outPos) {
				outPos = 0;
			}
			count--;
			this.notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Input implements Runnable {
	private Storage st;
	private int num;

	Input(Storage st) {
		this.st = st;
	}

	public void run() {
		while (true) {
			st.put(num++);
		}
	}
}

class Output implements Runnable {
	private Storage st;
	private int num;

	Output(Storage st) {
		this.st = st;
	}

	public void run() {
		while (true) {
			st.get();
		}
	}
}

public class example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage st = new Storage();
		Input input = new Input(st);
		Output output = new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}

}
