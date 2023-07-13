import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=0;
		
		System.out.println("\n 1 for addition\n 2 for substraction\n 3 for multiplication\n 4 for division\n enter your choice");
		int choice=sc.nextInt();
		
		
		
		switch(choice) {
		
		
		case 1:
			
			result=num1+num2;
			System.out.println("result" +result);
			break;
			
			
			
		case 2:
			
			result=num1-num2;
			System.out.println("result" +result);
			break;
			
			
			
		case 3:
			
			
			result=num1*num2;
			System.out.println("result" +result);
			break;
			
			
			
		case 4:
			
			result=num1/num2;
			System.out.println("result" +result);
			break;
			
			
		default:
			
			System.out.println("invalid");
			
			
			
		}
		
		
		
	}

}
