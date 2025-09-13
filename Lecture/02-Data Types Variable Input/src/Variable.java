import java.sql.SQLOutput;

public class Variable {
    public static void main(String[] args) {

        // case sensitive
        // can be Letters , Digits , Dollar Signs, or Underscores
        // Must Begin with a Letter , Dollar sign ($) , or underscore (_)
        // cannot use java keyboards as variable names
        // camel case

        String myFullName = "Deva Arya";
        System.out.println(myFullName);


        // WHOLE NUMBERS
        // bytes
        // short
        // int
        // long


        byte age1 = -20;
        short age2 = 20;
        int age = 20;
        long age3 = 20;

        System.out.println("Byte maximum and Minimum Value :");
        System.out.println("minimum value is : " + Byte.MIN_VALUE);
        System.out.println("maximum value is : " + Byte.MAX_VALUE);

        System.out.println("Short maximum and Minimum Value :");
        System.out.println("minimum value is : " + Short.MIN_VALUE);
        System.out.println("maximum value is : " + Short.MAX_VALUE);

        System.out.println("Integer maximum and Minimum Value :");
        System.out.println("minimum value is : " + Integer.MIN_VALUE);
        System.out.println("maximum value is : " + Integer.MAX_VALUE);

        System.out.println("long maximum and Minimum Value :");
        System.out.println("minimum Value is : " + Long.MIN_VALUE);
        System.out.println("maximum Value is : " + Long.MAX_VALUE);




        // Decimal numbers
        // float
        // double

        float mySalary = 1000.15638745614674f;
        double yourSalary = 1000.15638745614674;

        System.out.println(mySalary);
        System.out.println(yourSalary);

        // Float Range
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("Float Minimum value is : " + floatMin);
        System.out.println("Float Maximum value is : " + floatMax);


        // Double Range
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("Double Minimum Value is : " + doubleMin);
        System.out.println("Double Maximum valur is : " + doubleMax);




        // characters
        // char

        char initial = 'A';
        System.out.println((int)initial);
        System.out.println(initial);
        System.out.println((char) 10084);
        char hindiChar = 2309;
        System.out.println(hindiChar);
        char heart = '\u2764';    // unique code Represenattion
        System.out.println(heart);


        System.out.println("Character minimum value is : " + (int) Character.MIN_VALUE);
        System.out.println("Character maximum value is : " + (int) Character.MAX_VALUE);

        for (int i = 0; i <= 128; i++)
            System.out.println((char) i);



        // booleans
        //boolean

        boolean isEligible = false;
        System.out.println(isEligible);








    }
}