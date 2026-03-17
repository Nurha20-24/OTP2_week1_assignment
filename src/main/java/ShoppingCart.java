import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        double totalCost = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");

        int choice = scanner.nextInt();

        Locale locale = switch (choice) {
            case 1 -> new Locale("en", "US");
            case 2 -> new Locale("fi", "FI");
            case 3 -> new Locale("sv", "SE");
            case 4 -> new Locale("ja", "JP");
            default -> new Locale("en", "US");
        };

        ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", locale);

        System.out.println(rb.getString("prompt1"));
        int numberOfItems = scanner.nextInt();

        for (int i = 0; i < numberOfItems; i++) {

            System.out.println(rb.getString("prompt2"));
            double price = scanner.nextDouble();

            System.out.println(rb.getString("prompt3"));
            int quantity = scanner.nextInt();

            totalCost +=  calculateTotalCost(price, quantity);
        }

        System.out.println(rb.getString("cost") + " " + totalCost);

    }

    public static double calculateTotalCost(double price, int quantity) {
        return price * quantity;
    }
}
