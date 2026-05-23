package April_Batch;
import java.util.Scanner;

public class loopQ5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price, total = 0;

        while (true) {
            System.out.print("Enter item price (0 to stop): ");
            price = sc.nextInt();

            if (price == 0) {
                break;
            }

            total += price;
        }

        System.out.println("Total Price: " + total);

        sc.close();
    }

}
