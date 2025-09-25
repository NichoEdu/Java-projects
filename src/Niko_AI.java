import java.util.Scanner;

public class Niko_AI {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("\n Hello my name is Nicholas Khayombe and I am an Artificial Intelligence, what's your name?");
        String name=a.nextLine();
        System.out.println("\n Well hello " +name);
        System.out.println("\n How is your day going today?");
        System.out.println("\n choose 1: It was great, thanks! Super productive and I even had time to relax a bit");
        System.out.println("\n choose 2: Kind of a long one, to be honest. Glad it’s over");
        System.out.println("\n choose 3: Not bad at all. Just a regular day, you know?");
        System.out.println("\n choose 4: It had its ups and downs, but I learned something important, so I’m grateful.");
        int day=a.nextInt();
        if (day==1)
            System.out.println("\n That’s awesome to hear! You deserve more days like that.");
        else if (day==2)
            System.out.println("\n Totally get that feeling. Glad you made it through.");
        else if (day==3)
            System.out.println("\n Sometimes those are the best—nice and uneventful!");
        else if (day==4)
            System.out.println("\n Glad you’re seeing the good in it. Hope tomorrow brings more ups than downs");
        else
            System.out.println("\n Invalid entry Please choose numbers 1,2,3,4 to choose how you feel");
        System.out.println("I had a nice moment with you thank you "+name);
        System.out.println("I hope it your day continues being fantastic");

    }
}
