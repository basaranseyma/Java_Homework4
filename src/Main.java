import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, total, startPrice = 10, perKm = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();

        total = km * perKm;
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Total cost: " + total);
    }
}