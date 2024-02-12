import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //declare variables
        int age = 0;
        int DRINKING_AGE = 21;

        System.out.print("Enter your age: ");

        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
        }

        if(age >= DRINKING_AGE)
        {
            System.out.println("You get a wrist band. Please drink resposibly.");
        }
    }
}