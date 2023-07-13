
public class StaticHello {
	int  a=10;
	static int b=20;
	
	
	public static void main(String arg[]) {
		
		
		StaticHello h=new StaticHello();
		System.out.println("h1.a:"+h.a);
		StaticHello h1=new StaticHello();
		
		h.hello();
		
		
		h.b=200;
		h1.b=300;
		
		
		h.a=600;
		h1.a=700;
		
		System.out.println("h1.a:"+h1.a);
		
	}
	void hello() {

}
}
