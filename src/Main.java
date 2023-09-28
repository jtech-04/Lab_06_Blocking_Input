import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String firstName = "";
        String lastName = "";
        String fullName = "";
        String trash = "";

        int favNum = 0; //1 -10
        //int salary = 0;
        double salary = 0.0;

        Scanner in = new Scanner(System.in);

        //This is the way that we do a prompt using print instead of println
        System.out.print("Enter your first name: ");
        //ln makes it go to the next line print will make it display the prompt
        firstName = in.nextLine();

        System.out.println("You told me your first name is: " + firstName );

        System.out.print("Enter your last name: ");
        lastName = in.nextLine();

        System.out.println("You told me your last name is: " + lastName);

        fullName = firstName + " " + lastName;

        System.out.println("I am guessing that your full name is: " + fullName);

        //OK now lets read some numbers

        System.out.println("Enter your fav number [1 - 10]: ");
        if (in.hasNextInt()) // user entered a number correctly
        {
            favNum = in.nextInt();
            in.nextLine(); //Clear the newline / enter from the buffer

            if(favNum >= 1 && favNum <=10)
            {
                System.out.println("you said your fav num is: " + favNum);
            }
            else
            {
                System.out.println("you said your fav num is: " + favNum);
                System.out.println("But, that is not in the range of [1 - 10]");
            }
            //System.out.println("you said your fav num is: " + favNum);
        }
        else // dont have a number Must read buffer as a trash string
        {
            trash = in.nextLine();
            System.out.println("You told me " + trash);
            System.out.println("Run the program again and do the input correctly");

        }

        System.out.println("Enter your salary: ");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); //clear the buffer every time after reading a number
            System.out.println("You said your salary is: " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("you entered " + trash + " which is wrong!");
            System.out.println("run the program again with the correct input ");
        }

    }
}