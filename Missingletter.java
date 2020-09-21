import java.util.*;
class Missingletter
{
    public static void main(String[]args)
    {
    Scanner sc =new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String w[]=s1.split("_");
    String ws[]=s2.split(";");
    int n1=s1.length();
    boolean check=false;
    int c=0;
    for(String x:ws){
        int xc=x.length();
        if(xc==n1)
            c+=1;
        }
    String ms[]=new String[c];
    int in=0;
    for(String x:ws){
        int xc=x.length();
        if(xc==n1){
            ms[in]=x;
            in++;
	}
        }
    int c1=w[0].length();
    int c2=w[1].length();
    for(int i=0;i<c;i++){
        String s="";
        String ex=ws[i];
        for(int j=0;j<c1;j++){
            s+=ex.charAt(j);
        }
        if((s.toUpperCase()).equals(w[0].toUpperCase())){
            int cc=c1+1;
            s="";
            for(int k=0;k<c2;k++){
                s+=ex.charAt(cc+k);
            }
            if((s.toUpperCase()).equals(w[1].toUpperCase())){
                System.out.print(ex.toUpperCase()+";");
		check=true;
		}
        }
    	}
	if(check==false)
		System.out.print("ERROR-009");
    }
}
    
