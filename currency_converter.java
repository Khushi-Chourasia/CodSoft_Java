import java.util.*;

public class currency_converter {

    // Conversion rates declared as constants by using final keyword
    private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_INR = 83.00;
    private static final double USD_TO_JPY = 109.80;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the amount in USD: ");
        double amountUSD = sc.nextDouble();

        // Displaying the currency options
        System.out.println("\nCurrency Converter : \n");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to INR");
        System.out.println("3. USD to JPY");
        System.out.print("\nEnter your choice (1/2/3): ");
        int choice = sc.nextInt();

        double convertedAmount = 0;
        String target = "";

        switch (choice) {
            case 1:
                convertedAmount = amountUSD * USD_TO_EUR;
                target = "EUR";
                break;
            case 2:
                convertedAmount = amountUSD * USD_TO_INR;
                target = "INR";
                break;
            case 3:
                convertedAmount = amountUSD * USD_TO_JPY;
                target = "JPY";
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.println("\nYour Currency Conversion Result is:");
        System.out.println("\n   " + amountUSD + " USD = " + convertedAmount + " " + target);
        sc.close();
    }
}