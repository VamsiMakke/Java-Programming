import java.util.*;

public class Exp13
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try{
		    System.out.println("ENTER A VALUE:");
		int a=sc.nextInt();
		    System.out.println("ENTER B VALUE:");
		int b=sc.nextInt();
		    int c=a/b;
		    
		    System.out.println(c);
		    
		    
		}
		catch(ArithmeticException e){
		    System.out.println("Arithmetic Exception Occured!");
		}
		
		try{
		    System.out.println("ENTER A INTEGER VALUE:");
		    int x=sc.nextInt();
		    
		}
		catch(InputMismatchException e1){
		    System.out.println("InputMisMatchException Occured!");
		}
		
	}
}
