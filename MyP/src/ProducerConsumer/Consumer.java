package ProducerConsumer;//conflict test

public class Consumer implements Runnable {
int i=-1;
int arr[],size;


Consumer(int arr[],int size){
	this.arr=arr;
	this.size=size;
}

public void run(){
	 
	
	while(true){
		synchronized(arr){

		
	
			
			try{
				while(ProdConsMain.getCount()==0){
				
				//	Thread.sleep(2000);
					System.out.println("queue is empty. " +Thread.currentThread().getName()+" is going to wait()...");
					arr.wait();
					System.out.println(Thread.currentThread().getName()+" is now out of wait()");
					//Thread.sleep(2000);

				}
				
				}
			catch(InterruptedException ex){
			}
			
			     
			    System.out.println("Remaining= "+ProdConsMain.getCount());
				System.out.println(Thread.currentThread().getName() + " :"+arr[ProdConsMain.getCount()-1]);
			
				ProdConsMain.setCount(ProdConsMain.getCount()-1);
				System.out.println(Thread.currentThread().getName()+" is going to notifyAll()...");
				arr.notifyAll();
				//testing consprod
		}
		
	}
}

}
//one more change
//another change
