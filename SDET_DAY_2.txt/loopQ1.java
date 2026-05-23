package April_Batch;
import java.util.Scanner;


public class LoopQ1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of employees: ");
        n = sc.nextInt();

        int salary;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter salary of employee " + i + ": ");
            salary = sc.nextInt();

            salary = salary + 5000;
            System.out.println("Updated Salary: " + salary);
        }

        sc.close();
    }

}
