import java.util.Scanner;
public class ExpNo8 {
    static String userName;
    static String emailId;
    static String mobileNumber;
    static String password ;
    static Scanner sc = new Scanner(System.in); 
    public static void uName() {
    	String regex = "[A-Z a-z _ 0-9]+";
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
         String regex2 = "[A-Z a-z_.@0-9]+";
         if(emailId.length()>10) {
             if(emailId.matches(regex2)) {
                 System.out.println("Valid emailId");
             }
             else {
                 System.out.println("Invalid emailId Please re enter");
                 eMail();
             }
         }
         else {
             System.out.println("emailId should have atleast 10 character ");
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


        String regex4 = "[A-Z a-z_.@0-9!#$%]+";
        if(password.length()>8) {
            if(password.matches(regex4)) {
                System.out.println("Valid password");
                System.out.println("------THANK YOU---------");
            }
            else {
                System.out.println("Invalid password Please re enter");
                pWord();
            }
        }
        else {
            System.out.println("password should have atleast 8 character ");
            pWord();
        }
    }
    public static void userData(){
    	uName();
    	eMail();
    	pNum();
    	pWord();
    }

    public static void main(String []args){
        userData();
    }
}
