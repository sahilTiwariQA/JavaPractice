package defaultPackage;

public class Loops {

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



    }
}
