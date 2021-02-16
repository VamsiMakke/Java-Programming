import java.util.Scanner;
public class ExpNo8 {
    static String userName;
    static String emailId;
    static String mobileNumber;
    static String password ;
    static Scanner sc = new Scanner(System.in); 
    public static void uName() {
    	String regex = "[A-Za-z_0-9]+";
        System.out.println("Enter Your Name : ");
        userName = sc.nextLine();
        if(userName.length()>0) {
            if(userName.matches(regex)) {
                System.out.println("Valid User Name");
            }
            else {
                System.out.println("Invalid User Name Please re enter");
                uName();
            }
        }
        else {
            System.out.println("User Name should have atleast 1 character Plz re enter");
            uName();
        }
    }
    public static void eMail() {
    	 System.out.println("Enter Your emailId");
         emailId = sc.nextLine();
         String regex2 = "[A-Za-z_0-9]+[@]+[a-zA-z]+[.comnet]+";
             if(emailId.matches(regex2)) {
                 System.out.println("Valid emailId");
             }
             else {
                 System.out.println("Invalid emailId Please re enter");
                 eMail();
             }
         }
    public static void pNum() {
    	System.out.println("Enter Your Mobile Number");
        mobileNumber = sc.next();
        String regex3 = "[0-9]+";
        if(mobileNumber.length()==10){
            if(mobileNumber.matches(regex3)){
                System.out.println("vaild Number");
            }
            else {
                System.out.println("Invalid Number");
                pNum();
            }
        }
        else {
            System.out.println("Number should have 10 digits plz re enter");
            pNum();
        }
    }
    public static void pWord() {
    	System.out.println("Enter Your Password");
        password = sc.next();
        if(password.length()>8) {
                System.out.println("Valid password");
                System.out.println("------THANK YOU---------");
            }
            else {
                System.out.println("Invalid password Please re enter");
                pWord();
            }
    }
    public static void main(String []args){
        uName();
    	eMail();
    	pNum();
    	pWord();
    }
}
