package ProducerConsumer;

public class Producer implements Runnable {
int i=-1;
final int  size;
int arr[];


Producer(int arr[],int size){
 
	this.arr=arr;
	this.size=size;
}

@Override
public void run(){
	 
	
	while(true){
		 
		
		synchronized(arr){
			 
			try{ 
				
				if(ProdConsMain.getCount()==size){
					
				    System.out.println("queue is full. Producer is going to wait()...");
				  //  Thread.sleep(2000);
					arr.wait();
					System.out.println("Producer is now out of wait()...");
					//Thread.sleep(7000);
				}
			}
			catch(InterruptedException ex){
			}
		
		
			
			arr[ProdConsMain.getCount()]=(int)(Math.random()*1000);
			
			System.out.println(Thread.currentThread().getName() + " :"+arr[ProdConsMain.getCount()]);
			
			ProdConsMain.setCount(ProdConsMain.getCount()+1);
			System.out.println("Remaining= "+ProdConsMain.getCount());
			
			System.out.println(Thread.currentThread().getName()+" is going to notifyAll()...");
			 
			arr.notifyAll();
			
		}	
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
