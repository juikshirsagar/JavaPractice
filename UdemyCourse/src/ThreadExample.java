class MultithreadingWithThread extends Thread{
	// implements Runnable 
	public void run() {
		try {
			System.out.println(Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}




public class ThreadExample  {
public static void main(String[] args) {
	int n=9;
	for(int i=0;i<=n;i++) {
		MultithreadingWithThread t=new MultithreadingWithThread();
		t.start();
	}
}
	
}
