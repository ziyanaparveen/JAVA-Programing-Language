
public class Hello {
	
	
	public static void main(String[] args) {
		
		
		SampleThread st=new SampleThread();
		
		Thread t=new Thread(st);
		t.start();
		
        SampleThread st1=new SampleThread();
		
		Thread t1=new Thread(st1);
		t1.start();
	}

}
