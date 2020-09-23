package defaultPackage;

import java.util.Scanner;

public class Loops {

    static Scanner userInput = new Scanner(System.in);
    public static void main (String[] args)
    {
        int i=1;

        while(i<=20)
        {
            if (i==3)
            {
                i+=2;
                continue;
            }
            System.out.println(i);
            i++;

            if ((i%2) == 0)
            {
                i++;
            }

            if(i>10)
            {
                break;
            }
        }

        double myPi = 4.0;

        double j=3.0;

        while(j<111)
        {
            myPi = myPi - (4/j)+(4/(j+2));
            j += 4;
            System.out.println(myPi);
        }

        System.out.println("Value of Pi" + Math.PI);

// Take user input in while loop
        String contYorN = "Y";

        int h = 1;

        while (contYorN.equalsIgnoreCase("y"))
        {
            System.out.println(h);
            System.out.println(" Continue y or n ? ");
            contYorN = userInput.nextLine();
            h++;
        }

//        do - while loop

        int k = 100;
        do {
            System.out.println(k);
            k++;
        }
        while(k<10);

//        for loop

        for(int l=10; l >=1;l--)
        {
            System.out.println("For loop values"+l);
        }
    }
}
