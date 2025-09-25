import jdk.jshell.spi.ExecutionControl;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ATM {
    double balance=10000.00;
   void withdraw() {
       ATM Z;
        Scanner w = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = w.nextLine();
        System.out.println("Enter Transaction Amount");
        double amount = w.nextDouble();
        double newbalance = balance - amount;
        System.out.println("\n=======ATM RECEIPT=========");
        System.out.println("Account Holder:" + name);
        System.out.println("Withdraw Amount: KES" + amount);
        System.out.println("New balance: KES" + newbalance);
        System.out.println("Transaction Date: " + java.time.LocalDate.now());
        System.out.println("Thank you for using our ATM!");
        System.out.println("=============================================");
       System.out.println("Press 1 to Exit");
       int y=w.nextInt();
       if (y==1)
           System.out.println("Menu");
       Z = new ATM();
       Z.niko();
        w.close();
    }
    void Deposit(){
       ATM Z;
        Scanner d = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = d.nextLine();
        System.out.println("Enter Amount");
        double amount = d.nextDouble();
        double newbalance = balance + amount;
        System.out.println("\n=======ATM RECEIPT=========");
        System.out.println("Account Holder:" + name);
        System.out.println("Deposit Amount: KES" + amount);
        System.out.println("New balance: KES" + newbalance);
        System.out.println("Transaction Date: " + java.time.LocalDate.now());
        System.out.println("Thank you for using our ATM!");
        System.out.println("=============================================");
        System.out.println("Press 1 to exit back");
        int y=d.nextInt();
        if (y==1)
            System.out.println("Menu");
            Z = new ATM();
            Z.niko();
        d.close();
    }
    void balance(){
       ATM Z;
       Scanner b=new Scanner(System.in);
        System.out.println("Your current balance is:"+balance);
        System.out.println("Press 1 to Exit");
        int y=b.nextInt();
        if (y==1)
            System.out.println("Menu");
        Z = new ATM();
        Z.niko();
        b.close();
    }
    public static void main(String[] args) {
       niko();
    }
    public static void niko(){
           ATM Z;
           Scanner a = new Scanner(System.in);
           System.out.println("\n =========ATM==========");
           System.out.println("Please choose an option by numbers!!");
           System.out.println("\n 1. Deposit money");
           System.out.println("\n 2. Withdraw money");
           System.out.println("\n 3. Check balance");
           System.out.println("\n 4. Exit");
           int x = a.nextInt();
           if (x == 1) {
               System.out.println("DEPOSIT");
               Z = new ATM();
               Z.Deposit();
           } else if (x == 2) {
               System.out.println("WITHDRAW");
               Z = new ATM();
               Z.withdraw();
           } else if (x == 3) {
               System.out.println("BALANCE");
               Z = new ATM();
               Z.balance();
           } else if (x == 4) {
               System.out.println("EXITING...");
               System.exit(0);
           }
       }
    }

