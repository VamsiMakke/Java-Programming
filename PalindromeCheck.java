import java.util.*;
public class PalindromeCheck
{

    public static void main(String[] args) {  
	Scanner sc =new Scanner(System.in);
	String s=sc.nextLine();
	int len=s.length();
	for(int i=0;i<len/2;i++) {
		char f=s.charAt(i);
		char l=s.charAt(len-i-1);
		if(f!=l) {
			if(f==(s.charAt(len-i-2))) {
				System.out.print(l);
				System.exit(0);
			}
			if(l==(s.charAt(i+1))) {
				System.out.print(f);
				System.exit(0);
			}
		}
	}
	System.out.print("-1");
}
}