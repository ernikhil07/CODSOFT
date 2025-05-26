import java.util.*;
public class Task4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in from currency (like USD INR EUR): ");
        String initial_Curr = sc.nextLine().toUpperCase();
        System.out.print("Type in to currency (like EUR INR USD): ");
        String final_Curr = sc.nextLine().toUpperCase();
        System.out.print("Type in amount to convert: ");
        double amount = sc.nextDouble();
        double exchangeRate = getExchangeRate(initial_Curr, final_Curr);

        if (exchangeRate != 0) {
            double convertedAmount = amount * exchangeRate;
            System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, final_Curr);
        } else {
            System.out.println("Invalid currency pair or rate unavailable.");
        }
        sc.close();
    }

    private static double getExchangeRate(String from, String to) {
        if (from.equals("USD") && to.equals("INR")) return 83.2;
        if (from.equals("INR") && to.equals("USD")) return 0.012;
        if (from.equals("USD") && to.equals("EUR")) return 0.92;
        if (from.equals("EUR") && to.equals("USD")) return 1.08;
        return 0;
    }
}