package Operators;

public class PostIncrement {
    public static void main(String[] args) {
       /*  int a = 5;
        int b = a++; // Post-increment: b gets the value of a, then a is incremented
           a++;
           b++;
           int c= a + b; // c is the sum of the incremented values of a and b
        System.out.println("Value of a: " + a); // 7
        System.out.println("Value of a after post-increment: " + a); // 7
        System.out.println("Value of b after post-increment: " + b); // 6
        System.out.println("Value of c: " + c); // 13  */


      /*  int a = 26;
        a++;
        a++;
        System.out.println("Value of a after post-increment: " + a); // 28   */


      /*   int n = 30;
        n++;
        System.out.println(n++); // 31
        System.out.println(n); // 32
        System.out.println(n++); // 33
        System.out.println(n); // 34  */


        int m=180, n=300;
        System.out.println(m++ + n++ - m++); // 299
        System.out.println(n++ + n++); // 603
        System.out.println(m); // 182
        System.out.println(n); // 303

    }
    
}
