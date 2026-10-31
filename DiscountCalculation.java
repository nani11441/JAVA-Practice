 
 import java.util.Scanner;
 public class DiscountCalculation {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the purchase amount:");

    double amount= sc.nextDouble();

    double DiscountCalculation;

    if(amount>=20000){
        DiscountCalculation=amount*0.20;
    }else if(amount>=10000){
        DiscountCalculation=amount*0.15;
    }else if(amount>=5000){
        DiscountCalculation=amount*0.10;
    }else{
        DiscountCalculation=amount*0.05;
    }

    double finalAmount= amount-DiscountCalculation;
System.out.println("DiscountCalculation=" +DiscountCalculation);
System.out.println("final Amount="+finalAmount);
}
 }