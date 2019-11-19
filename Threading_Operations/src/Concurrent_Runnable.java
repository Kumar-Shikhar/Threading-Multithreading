// Now iplementing runnable interface and get rid of custom method.
class runner3 implements Runnable{
	

	@Override
	//assign distinct task to thread
	public void run() {
		for(int i=0; i<10;++ i){
			System.out.println("runner3" + " "+i);
		}
		
		
	}
}
class runner4 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; ++i){
			System.out.println("runner4" + " " +i);
		}		
	}
}
public class Concurrent_Runnable {
	public static void main(String[] args) {
		 
		Thread t3 = new Thread(new runner3());
		Thread t4 = new Thread(new runner4());
		t3.start();
		t4.start();
		
		
	}

}
