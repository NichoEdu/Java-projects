import java.awt.*;
import java.util.Scanner;

public class Area {
    private static Scanner shapes =new Scanner(System.in);
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("Choose options by numbers");
            System.out.println("1.Area of a Retangle");
            System.out.println("2.Area of a Circle");
            System.out.println("3.Area of a Triangle");
            option = shapes.nextInt();
            if (option == 1)
                Rectangle();
            else if (option == 2)
                Circle();
            else if (option == 3)
                Triangle();
            else
                System.out.println("Invalid Option!");
        }
        while (option != 3);
        shapes.close();
    }
    public static void Rectangle(){
        System.out.println("Enter the length");
        double length=shapes.nextDouble();
        System.out.println("Enter the width");
        double width= shapes.nextDouble();
        double area=length*width;
        System.out.println("The Area of the rectangle is: "+area);
    }
    public static void Circle(){
        System.out.println("Enter the radius");
        double radius=shapes.nextDouble();
        double area=PI*radius*radius;
        System.out.println("The Area of the circle is: "+area);
    }
    public static void Triangle(){
        System.out.println("Enter the base");
        double base=shapes.nextDouble();
        System.out.println("Enter the height");
        double height= shapes.nextDouble();
        double area=0.5*base*height;
        System.out.println("The Area of the triangle is: "+area);
    }
}

