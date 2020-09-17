package defaultPackage;

import java.util.Scanner;

public class JavaLessonTwo {

    static  Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Your favorite number : ");

        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();
            System.out.println("You enetered : "+numberEntered);

            int numberAdd = numberEntered+numberEntered;
            System.out.println(numberEntered+ "+" +numberEntered +"=" +numberAdd);

            int numberSubtract = numberEntered-2;
            System.out.println(numberEntered+ "-2 =" +numberSubtract);

            int numberTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered+ "*" + numberEntered +"=" +numberTimesSelf);

            float numberDivide = numberEntered/2f;
            System.out.println(numberEntered+ "/2 =" +numberDivide);

            float numberRemainder = numberEntered%2f;
            System.out.println(numberEntered+ "%2 =" +numberRemainder);

            numberEntered = numberEntered +2;
            System.out.println("numberEntered:"+numberEntered);
            numberEntered+=2;
            System.out.println("numberEntered:"+numberEntered);
            numberEntered-=2;
            System.out.println("numberEntered:"+numberEntered);
            numberEntered++;
            System.out.println("numberEntered:"+numberEntered);
            numberEntered--;
            System.out.println("numberEntered:"+numberEntered);


            int numberABS = Math.abs(numberEntered);
            System.out.println("number absolute:"+numberABS);
            int whichIsBigger =Math.max(6,8);
            int whichIsSmaller = Math.min(8,7);

            double numSqrt = Math.sqrt(5.23);

            int numCeiling = (int) Math.ceil(5.23); // returns 6
            int numFloor = (int) Math.floor(5.23); // returns 5
            int numRound = (int) Math.round(5.23); // returns 5
//      Get a random number
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("number random:"+randomNumber);
        }
        else
        {
            System.out.println("Enter an integer next time : ");
        }
    }
}
