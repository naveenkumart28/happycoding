
public class RunnableThread implements Runnable {
 
	private  int num = 10;

	public RunnableThread(int num) {
		this.num = num;
		Thread t = new Thread(this,"Interrpt Thread");
		t.start();
		
	}
	
	public  int getNum() {
		return num;
	}


	public  void setNum(int num) {
		this.num = num;
	}


	@Override
	public void run() {
		while(true) {
			 boolean val = isPrime(this.num);
		}
	}

	public static boolean isPrime(int num) {

		for (int j = 2; j < num / 2; j++) {
			if (num % j == 0)
				return true;
			else
				return false;
		}
		return false;
	}

}
