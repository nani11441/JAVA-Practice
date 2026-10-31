import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the some value:");
        int n= sc.nextInt();
        if(n>0){
            System.out.println("It is a Positive:");

        } else if(n<0){
            System.out.println("It is a Negative value:");
        }else if(n==0){
            System.out.println("It is a Zero value:");
        }else{
            System.out.println("It is invalide Number:");
        }
    }
    
}
