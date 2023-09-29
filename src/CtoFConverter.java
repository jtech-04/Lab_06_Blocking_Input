import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        double cTemp = 0;
        double fTemp = 0;
        boolean done = false;
        String trash = "";

        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter your temp in celsius: ");
            if(in.hasNextDouble())
            {
                cTemp = in.nextDouble();
                in.nextLine();
                fTemp = (cTemp * 9/5) + 32;
                System.out.println(cTemp + " in fahrenheit is " + fTemp);

                done = true;

            }

            else
            {
                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Please try again and enter a numerical temp");
            }
        }while(!done);
    }

}
