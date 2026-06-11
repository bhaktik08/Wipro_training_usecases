package April_Batch;
import java.util.Scanner;

public class loopQ2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPassword = 1234;
        int attempt;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Password: ");
            attempt = sc.nextInt();

            if (attempt == correctPassword) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Wrong Password");
            }
        }

        sc.close();
    }


}
