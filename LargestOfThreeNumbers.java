import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Value:");
        int a=sc.nextInt();

         System.out.println("Enter the Second Value:");
        int b =sc.nextInt();

         System.out.println("Enter the Third Value:");
        int c=sc.nextInt();

        if(a>b&& a>c){
            System.out.println("A value is greater:");
        } else if (b>a && b>c){
            System.out.println("B value is greater :");
        }else if (c>a&& c>b){
            System.out.println("C value is greater:");
        } else{
            System.out.println("some numbers are equal:");
        }
    }
    
    
}
