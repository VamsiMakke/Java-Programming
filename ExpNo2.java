import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int con_num = sc.nextInt();
        String con_name=sc.next();
        double prev=sc.nextDouble();
        double current=sc.nextDouble();
        String con=sc.next();
        double diff=current-prev;
        double amount;
        System.out.print("Amount: Rs.");
        String dom=new String("domestic");
        String com=new String("commercial");
        con=con.toLowerCase();
        if(con.equals(dom)==true)
            if(diff<=100){
                amount=diff*1;
                System.out.println(amount);
            }
            else if(diff>100 && diff<=200){
                amount=100+(diff-100)*2.50;
                System.out.println(amount);
            }
            else if(diff>200 && diff<=500){
                amount=350+(diff-200)*4;
                System.out.println(amount);
            }
            else{
                amount=1550+(diff-500)*6;
                System.out.println(amount);
            }
        else if(con.equals(com)){
            if(diff<=100){
                amount=diff*1;
                System.out.println(amount);
            }
            else if(diff>100 && diff<=200){
                amount=200+(diff-100)*4.50;
                System.out.println(amount);
            }
            else if(diff>200 && diff<=500){
                amount=650+(diff-200)*6;
                System.out.println(amount);
            }
            else{
                amount=2450+(diff-500)*7;
                System.out.println(amount);
            }
        }
        else
        System.out.println("INVALID INPUT!!");
    }
}
