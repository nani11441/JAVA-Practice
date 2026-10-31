import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "Nani";
        String correctPassword = "11441";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername)) {

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful.");
            } else {
                System.out.println("Wrong Password.");
            }

        } else {
            System.out.println("Wrong Username.");
        }

        sc.close();
    }
}
