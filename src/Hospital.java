import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner mlima=new Scanner(System.in);
        System.out.println("\n Enter the mass weight of the patient");
        double mass= mlima.nextDouble();
        System.out.println("\n Enter the height of the patient");
        double height= mlima.nextDouble();
        double BMI=mass/height;
        System.out.println("Your Body Mass Index is:"+BMI);
        if (BMI>=0 && BMI<18)
            System.out.println("Underweight");
        else if(BMI>=18.5 && BMI<24.5)
            System.out.println("Normal");
        else if (BMI>=25 && BMI<29)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
