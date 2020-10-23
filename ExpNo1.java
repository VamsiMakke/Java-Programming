import java.io.*;
import java.util.Scanner;
class ExpNo1{
        //Define instance variables here
        String number;
        String description;
        int quantity;
        double price;
        double invoiceAmount;
        public Invoice(){ }
        //Define parameterized constructor here
        Invoice(String number,String description,int quantity,double price){
            this.number=number;
            this.description=description;
            this.quantity=quantity;
            this.price=price;
        }
        
       // Setters
       public void setNumber(String number){
       
           this.number=number;
       }
       public void setDescription(String description){
       
           this.description=description;
       }
       public void setQuantity(int quantity){
       
           this.quantity=quantity;
       }
       public void setPrice(double price){
       
           this.price=price;
       }

       // Getters
       public String getNumber(){
       
           return this.number;
       }
        public String getDescription(){
       
           return this.description;
       }
        public int getQuantity(){
       
           return this.quantity;
       }
        public double getPrice(){
       
           return this.price;
       }

       public double getInvoiceAmount(){
                 invoiceAmount = 0.0;
                // Write your logic here
                if(quantity<0){
                    quantity=0;
                }
                if(price<0){
                    price=0.0;
                }
                invoiceAmount=quantity*price;
                return invoiceAmount;
       }
       public void details()
        {
            System.out.printf("Part Number :"+number+"\nPart Description :"+description+"\nQuantity :"+quantity+"\nPrice(per item) :"+price);
            System.out.printf("\n Amount :"+invoiceAmount);
            System.out.println();
        }
}
public class Main{
         public static void main(String []args){
                   Invoice myInvoice=new Invoice();
                   //Write your code here 
                   Scanner sc=new Scanner(System.in);
                   myInvoice.number=sc.nextLine();
                   myInvoice.description=sc.nextLine();
                   myInvoice.quantity=sc.nextInt();
                   myInvoice.price=sc.nextDouble();
                   myInvoice.getInvoiceAmount();
                   myInvoice.details();
         }
}
