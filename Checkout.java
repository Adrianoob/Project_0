import java.util.Scanner;
public class Checkout {
    public static void main(String[]args) {
        Cashier cashier = new Cashier();
        System.out.println("    You can start to scan your first item.");
        System.out.print("    First one>");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        
        while(!input.equals("pay")) {
            cashier.addItem(input);
            System.out.print("    Next item>");
            input = scan.next();
        }
        
        double sum = cashier.sum();
        double tax = cashier.tax();
        
        System.out.println(cashier.print());
    }
}