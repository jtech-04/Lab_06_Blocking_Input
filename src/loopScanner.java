import java.util.Scanner;
public class loopScanner
{
    public static void main(String[] args)
    {
        String trash = "";
        int favNum = 0; //1 -10
        double salary = 0.0;
        boolean done = false;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your fav number [1 - 10]: ");
            if (in.hasNextInt()) // user entered a number correctly
            {
                favNum = in.nextInt();
                in.nextLine(); //Clear the newline / enter from the buffer

                if (favNum >= 1 && favNum <= 10) {
                    System.out.println("you said your fav num is: " + favNum);
                    done = true;
                } else //out of range
                {
                    System.out.println("you said your fav num is: " + favNum);
                    System.out.println("But, that is not in the range of [1 - 10]");
                }
                //System.out.println("you said your fav num is: " + favNum);
            } else // dont have a number Must read buffer as a trash string
            {
                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Run the program again and do the input correctly");

            }

        }while(!done);

        /* do while loop syntax
        do
        {

        }while(condition); as long as the condition is true keep looping
         */

        //age program where you need to be 18 but not older than 35
        int age = 0;

        done = false;

        do {

            System.out.print("enter your age [18 - 35]:");
            if(in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine();
                // test the range of the int your read
                if(age >= 18 && age <= 35)
                {
                    System.out.println("your age is: " + age);
                    done = true;
                }
                else // number is not in range
                {
                    System.out.println("The age you entered: "+ age + "  is out of range!");
                }
            }
            else // dont have a number
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is invalid!");
            }

        }while(!done);
    }

}
