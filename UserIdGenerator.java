import java.util.*;
class UserIdGenerator
{
    public static void main(String[] args) {  
	Scanner sc =new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	String p=sc.nextLine();
	int n1=sc.nextInt();
	int n=n1-1;
	int x1=s1.length();
	int x2=s2.length();
	int as;
	String op="";
	if(x1!=x2)
		{
			if(x1>x2)
				{
					char s=s2.charAt(x2-1);
					String ops=s+s1;
					for(int i=0;i<ops.length();i++)
					{
							as=(int)ops.charAt(i);
							if(as>90)
								op+=(char)(as-32);
							else
								op+=(char)(as+32);
					}			
				}
			else
				{
					char s=s1.charAt(x1-1);
					String ops=s+s2;
					for(int i=0;i<ops.length();i++)
					{
						as=(int)ops.charAt(i);
						if(as>90)
							op+=(char)(as-32);
						else
							op+=(char)(as+32);
					}					
				}
		}
	else
		{	int as1=0;
			int as2=0;
			int ii=0;
			while(as1==as2)
			{
			 as1=(int)s1.charAt(ii);
			 as2=(int)s2.charAt(ii);
			ii+=1;
			}
			if(as1>as2)
			{
				char s=s2.charAt(x2-1);
				String ops=s+s1;
				for(int i=0;i<ops.length();i++)
				{
						as=(int)ops.charAt(i);
						if(as>90)
							op+=(char)(as-32);
						else
							op+=(char)(as+32);
				}					
			}
		else
			{
				char s=s1.charAt(x1-1);
				String ops=s+s2;
				for(int i=0;i<ops.length();i++)
				{
					as=(int)ops.charAt(i);
					if(as>90)
						op+=(char)(as-32);
					else
						op+=(char)(as+32);
				}						
			}
		}
	System.out.print(op+p.charAt(n)+p.charAt(p.length()-(n1)));
}
}
