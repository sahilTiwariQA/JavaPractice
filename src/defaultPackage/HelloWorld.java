package defaultPackage;

public class HelloWorld {

    static String randomString = "String will be printed";
    public static void main(String[] args)
    {
        System.out.println(randomString);

//        Declaration statement
        int integerOne = 23;

//        Expression statement
        int integerTwo = integerOne+1;

        byte biggestByte = 127;
        short biggestShort = 32767;
        long longVar = 123987654321L;
        float bigFloat = 3.14F;
        double bigDouble = 3.141232312322;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

//        Characters print ASCII values if not surrounded be single quotes
        char charVar = 65;
//        char are surrounded by sinle quotes
        char anotherCharVar = 'A';

//        escaped characters
        char escapedChars = '\b'; //backspace
        char escapedChars2 = '\f'; //form feed
        char escapedChars3 = '\n'; //line feed
        char escapedChars4 = '\r'; //carriage return
        char escapedChars5 = '\t'; //horizontal tab
        char escapedChars6 = '\"'; // double quote
        char escapedChars7 = '\''; //single quote
        char escapedChars8 = '\\'; // double slash

//        String

        String randomString = "Im a random string";
        String anotherString = "Stuff from another string";

//        Combine two strings
        String combinedString = randomString+ ' ' +anotherString;
        System.out.println(combinedString);

//        Convert other types to string,all base type should be uppercase while converting
        String byteString = Byte.toString(biggestByte);
        String shortString = Short.toString(biggestShort);
        String intString = Integer.toString(integerOne);
        String longString = Long.toString(longVar);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);

//    Cast or convert other types into other (float,boolean and char don't work)
        double aDoubleValue = 13.232323223;
        int doubleToInt = (int) aDoubleValue;
        System.out.println("Double to int="+doubleToInt);

        byte doubleToByte = (byte) aDoubleValue;
        short doubleToShort = (short) aDoubleValue;
        long doubleToLong = (long) aDoubleValue;

//        turn a string into other primitive datatype
        int stringToInt = Integer.parseInt(intString);
        System.out.println("String to Int "+ stringToInt);

        byte stringToByte = Byte.parseByte(byteString);
        short stringToShort = Short.parseShort(shortString);
        long stringToLong = Long.parseLong(longString);
        float stringToFloat = Float.parseFloat(floatString);
        double stringToDouble = Double.parseDouble(doubleString);
        boolean stringToBoolean = Boolean.parseBoolean(booleanString);

    }
}
