import java.util.Scanner;

public class TASK4 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("===== CURRENCY CONVERTER =====");

		        System.out.println("Available Currencies:");
		        System.out.println("1. INR");
		        System.out.println("2. USD");
		        System.out.println("3. EUR");
		        System.out.println("4. GBP");

		        System.out.print("Choose base currency (1-4): ");
		        int base = sc.nextInt();

		        System.out.print("Choose target currency (1-4): ");
		        int target = sc.nextInt();

		        System.out.print("Enter amount to convert: ");
		        double amount = sc.nextDouble();

		        double amountInINR;

		        switch (base) {
		            case 1:
		                amountInINR = amount;
		                break;
		            case 2:
		                amountInINR = amount * 83.0;
		                break;
		            case 3:
		                amountInINR = amount * 90.0;
		                break;
		            case 4:
		                amountInINR = amount * 105.0;
		                break;
		            default:
		                System.out.println("Invalid base currency.");
		                sc.close();
		                return;
		        }

		        double convertedAmount;

		        switch (target) {
		            case 1:
		                convertedAmount = amountInINR;
		                break;
		            case 2:
		                convertedAmount = amountInINR / 83.0;
		                break;
		            case 3:
		                convertedAmount = amountInINR / 90.0;
		                break;
		            case 4:
		                convertedAmount = amountInINR / 105.0;
		                break;
		            default:
		                System.out.println("Invalid target currency.");
		                sc.close();
		                return;
		        }

		        System.out.println("Converted Amount: " + convertedAmount);
		        System.out.println("Thank you for using Currency Converter!");

		        sc.close();

	}

}

