package ProducerConsumer;

public class ProdConsMain {

	
	volatile private static int count=0;
	
	//added comments
	public static void main(String args[]){
		int f=9;
		String s="abc";Class<Long> c=Long.class;
		StringBuilder sb=new StringBuilder();
		byte[] b=s.getBytes();
		int i=0;
		while(i<b.length)

			sb.append((char)b[i++]);
		System.out.println(sb.toString() );

	}
	
	 public static int getCount(){
		return  count; 
	 }
	 public static void setCount(int count){
		 ProdConsMain.count=count;
	 }
}
