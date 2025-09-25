import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=w.nextLine();
        System.out.println("Enter Transaction Amount");
        double amount=w.nextDouble();
        double balance=5000.00;
        double newbalance=balance-amount;
        System.out.println("\n=======ATM RECEIPT=========");
        System.out.println("Account Holder:"+name);
        System.out.println("Previous balance: KES"+balance);
        System.out.println("Withdraw Amount: KES"+amount);
        System.out.println("New balance: KES"+newbalance);
        System.out.println("Transaction Date: "+java.time.LocalDate.now());
        System.out.println("Thank you for using our ATM!");
        System.out.println("=============================================");
        w.close();
    }
}
