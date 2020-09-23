package defaultPackage;

import java.util.*;

public class Exceptions {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        divideByZero(7);

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
}
