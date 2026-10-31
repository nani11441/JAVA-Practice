import java. util.Scanner;
public class TablesUsingForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Table number   :");
        int table= sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(table+ "x" + i+ "=" + (table*i));
        }
    }
    
}
