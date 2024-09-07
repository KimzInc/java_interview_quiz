
class Entry3{
    public static void main(String[] args) {
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte: " + myMinByteValue);
        System.out.println("Min Byte: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;



        System.out.println("Min Short: " + myMinShortValue);
        System.out.println("Max Short: " + myMaxShortValue);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Min Int: " + myMinIntValue);
        System.out.println("Min Int: " + myMaxIntValue);



        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Min Float: " + myMinFloatValue);
        System.out.println("Min Float: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Min Double: " + myMinDoubleValue);
        System.out.println("Max Double: " + myMaxDoubleValue);

        //Output

        /*
         *Min Short: -32768
         *Max Short: 32767
         *Min Int: -2147483648
         *Min Int: 2147483647
         *Min Byte: -128
         *Min Byte: 127
         *Min Float: 1.4E-45
         *Min Float: 3.4028235E38
         *Min Double: 4.9E-324
         *Max Double: 1.7976931348623157E308
         *
         */

       // byte myNewByteValue = (myMinByteValue/2); error

        //casting
        byte myNewByteValue = (byte)(myMinByteValue/2);
        System.out.println(myNewByteValue);

        //casting
        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println(myNewShortValue);

    }
}

