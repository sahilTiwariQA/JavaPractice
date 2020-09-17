package defaultPackage;

public class LessonThree {

    public static void main(String[] args)
    {
        int value1 = 5;
        int value2 = 9;

        // The Conditional or Ternary Operator assigns one or another value based on a condition
        // If true valueOne is assigned to biggestValue. If not valueTwo is assigned
        int bigValue = (value1 > value2) ? value1 : value2;
        // if   value1 is > value2   assign ^ else assign ^

        System.out.println("Biggest value between two vars are : " + bigValue);

    }
}
