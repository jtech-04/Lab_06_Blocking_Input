import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean done = false;
        String trash = "";

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Enter the measurement you want configured in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                miles = meters/ 1609.34;
                feet = 3.28084 * meters;
                inches = 39.3701 * meters;

                System.out.println(meters + " in miles is " + miles);
                System.out.println(meters + " in feet is " + feet);
                System.out.println(meters + " in inches is " + inches);

                done = true;
            }

            else
            {
                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Please try again and enter a numeric distance. ");
            }
        } while (!done);
    }
}
/*
user for a measurement in meters and then converts it to miles, feet, and inches. Again, check for valid input and exit with an error msg if you don’t get it. LET IT REPEAT You can look up the conversion formulas with the Web
trick- how to know if you have miles or not(might not have enough)
steps:
1. first ask for the number/ prompt them
2. then convert the number into: miles, feet, and inches at the same time
3. create else's that will make it invalid and force them to go again
4. know how much for it to be miles(can't I do just decimals?)
 */