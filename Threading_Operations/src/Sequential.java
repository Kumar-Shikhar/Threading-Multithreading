/*
 * Disadvantages of Multithreading :
   cost involved.
   it manipulates data located on same memory.
   difficult to design.
   hard to detect errors.
   expensive operations : 
   switiching of threads , cpu save local data , pointers of current thread + loads the data of other data.
   
     for samlller problems it is not necessary to use multithreading.
     sorting is slower in it.
 */

/*
 * Life Cycle of thread : 
   new : thread is born. until start method()
   runnable : thread is waiting to asssign a task. after start()
   running :  working on its task .
   waiting : for another thread to finsh its task. and if finshed it goes to runnable state.
   dead : finishes its task.
 */


//sequential execution
//one thread and then another in sequence
class runner1{
	public void startrunning(){
		for(int i=0; i<10;++ i){
			System.out.println("runner1" + " "+i);
		}
		
	}
}
class runner2 {
	public void startrunning(){
		for(int i=0; i<10; ++i){
			System.out.println("runner2" + " " +i);
		}
		
	}
}
public class Sequential {
	public static void main(String[] args) {
		runner1 r1 = new runner1();
		runner2 r2 = new runner2();
		
		r1.startrunning();
		r2.startrunning();
	}

}
