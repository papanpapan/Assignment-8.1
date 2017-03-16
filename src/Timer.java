
public class Timer implements Runnable {
	public void run() {
		for(int a=7;a<=10;a++){
			System.out.println("Thread 1 Timer Messege :"+a);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 2 Timer Messege :"+a);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
			
		}
	public static void main(String args[]){
		Timer t=new Timer();
		Thread t1=new Thread(t);
		t1.start();

		
	}

}


