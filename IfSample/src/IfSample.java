import java.util.Scanner;

public class IfSample {
	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		if(num<0) {
			System.out.println("number is negtive");
		}
		else {
			System.out.println("number is positive");
		}
		
	}

}
