

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter your calculations");
        Scanner calc=new Scanner(System.in);
        double x=calc.nextDouble();
        char y= calc.next().charAt(0);
        double z=calc.nextDouble();
        double result;
        switch (y){
            case '+':result =x+z;break;
            case '-':result =x-z;break;
            case '*':result =x*z;break;
            case '/':result =x/z;break;
            default:
                System.out.println("Invalid Arithmetics");
                return;
        }
        System.out.println("result" +result);
        calc.close();
    }
}
