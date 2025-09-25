import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = d.nextLine();
        System.out.println("Enter Amount");
        double amount = d.nextDouble();
        double balance = 5000.00;
        double newbalance = balance + amount;
        System.out.println("\n=======ATM RECEIPT=========");
        System.out.println("Account Holder:" + name);
        System.out.println("Previous balance: KES" + balance);
        System.out.println("Deposit Amount: KES" + amount);
        System.out.println("New balance: KES" + newbalance);
        System.out.println("Transaction Date: " + java.time.LocalDate.now());
        System.out.println("Thank you for using our ATM!");
        System.out.println("=============================================");
        d.close();
    }
}
