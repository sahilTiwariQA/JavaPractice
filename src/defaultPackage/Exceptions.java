package defaultPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Exceptions {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
//        divideByZero(7);

//        System.out.println("How old are you ? ");
//        int age = checkValidAge();
//
//        if (age !=0){
//            System.out.println("You are "+ age + " years old");
//        }

        getAFile("./something.txt");

    }

    public static void divideByZero(int a)
    {
        try
        {
            System.out.println(a/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("you cant do that !");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    public static int checkValidAge()
    {
        try{
            return userInput.nextInt();

        }
        catch (InputMismatchException e)
        {
            userInput.next();
            System.out.println("That isn't a whole number .");
            return 0;
        }
    }

    public static void getAFile(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Sorry can't find the file");
        }
        catch (IOException e)
        {
            System.out.println("Unknown IO error");
        }
        catch (Exception e)
        {
            System.out.println("Some error occured" +e);
        }
        finally {
            System.out.println("");
        }

    }
}
