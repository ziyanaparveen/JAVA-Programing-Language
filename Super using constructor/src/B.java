
public class B extends A {
	
	
	int a;
	
	B(){
		
		
		System.out.println("its a B constructor");
	}
	
	B(int a){
		super(10);
		
		System.out.println("its an argument constructor of B");
		
	}
	void display() {
		
		super.display();
		
		System.out.println("its B");
	}
	
	
    void baseDisplay() {
	
	
	super.display();
}

      
      
      
      public static void main(String[] args) {
    	  
    	  B b=new B(10);
      }
		
	}
      


