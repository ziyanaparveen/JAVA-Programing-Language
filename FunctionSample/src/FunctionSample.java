import java.util.Scanner;

public class FunctionSample {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int result=sum(num1,num2);
		System.out.println("Result:"+result);
		
		
		
		
	}
	static int sum(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
	

}
