// Now using extends thread class, and get rid of custom method.
//with sleep they are executing at same time almost without seq processing.(not true)
// same processor for two threads.Time slicing is here.
class runner5 extends Thread{
	

	@Override
	public void run() {
		for(int i=0; i<100;++ i){
			System.out.println("runner5" + " "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
class runner6  extends Thread{

	@Override
	public void run() {
		for(int i=0; i<100;++ i){
			System.out.println("runner6" + " "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
public class Concurrent_Extends {
	public static void main(String[] args) {
		  runner5 r5 = new runner5();
		  runner6 r6 = new runner6();
	
		r5.start();
		r6.start();
		
		
	}

}
