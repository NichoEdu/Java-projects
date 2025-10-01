import java.util.Scanner;

public class calculator {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do {
        System.out.println("Choose a Function");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                add();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Invalid option!");
        }
        } while (option != 4);
    }

    public static void add() {
        System.out.println("Enter The first number");
        double x=scanner.nextDouble();
        System.out.println("Enter the Second number");
        double y=scanner.nextDouble();
        double result=x+y;
        System.out.println("The sum is: " +result);
    }
    public static void subtraction() {
        System.out.println("Enter the first number");
        double x=scanner.nextDouble();
        System.out.println("Enter the second number");
        double y=scanner.nextDouble();
        double result=x-y;
        System.out.println("The difference is: "+result);
    }
    public static void multiplication() {
        System.out.println("Enter the first number");
        double x=scanner.nextDouble();
        System.out.println("Enter the second number");
        double y=scanner.nextDouble();
        double result=x*y;
        System.out.println("The product is: "+result);
    }
    public static void division() {
        System.out.println("Enter the first number");
        double x=scanner.nextDouble();
        System.out.println("Enter the second number");
        double y=scanner.nextDouble();
        double result=x/y;
        System.out.println("The division is: "+result);
    }
}

