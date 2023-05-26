
import java.util.Scanner;

import chars.*;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		
		Manager manager1 = new Manager();
		
		/*manager1.receiveOrder(customer1);
		
		manager1.fillTopping(customer1);*/
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.printf("Commands:\n1. Receiving Orders\n2. Managing Orders\n3. Show score\n4. Exit\n\n");
			System.out.printf("Your Command: ");
			int cmd = scanner.nextInt();
			if (cmd == 1) {
				manager1.receiveOrder(customer1);
			} else if (cmd == 2) {
				manager1.fillTopping(customer1);
			} else if (cmd == 3) {
				System.out.printf("%d / %d\n\n", manager1.getCorrectMadeOrders(), manager1.getTotalOrders());
			} else {
				System.out.printf("%d / %d\n\n", manager1.getCorrectMadeOrders(), manager1.getTotalOrders());
				break;
			}
			
		}
		scanner.close();
		System.exit(0);
	}

}
