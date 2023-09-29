import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        double width = 0;
        double height = 0;
        double perimeter = 0;
        boolean done = false;
        double area = 0;
        double pythagorean = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the width of your rectangle: ");
            if (in.hasNextDouble()) { // the opener of the large if
                width = in.nextDouble();
                in.nextLine();

                System.out.print("Enter the height of your rectangle: ");
                if (in.hasNextDouble()) { // the opener of the small if
                    height = in.nextDouble();
                    in.nextLine();

                    perimeter = (width * 2) + (height * 2);
                    area = width * height;

                    System.out.println("The perimeter of your rectangle is " + perimeter);
                    System.out.println("The area of your rectangle is " + area);

                    pythagorean = Math.sqrt((height * height) + (width * width));
                    System.out.println("The diagonal length of your rectangle is " + pythagorean);

                    done = true;
                }  // close of small if

                else {
                    trash = in.nextLine();
                    System.out.println("You told me " + trash);
                    System.out.println("Please try again and enter a correct input ");

                }
            } // close of large if
            else
            {
                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Please try again and enter a correct input");
            }

        }while (!done) ;
    }
}
