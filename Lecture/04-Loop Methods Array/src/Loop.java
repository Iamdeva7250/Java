import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. while loop (1 to 10)
        int num = 1; // initialization
        while (num <= 10) { // condition
            System.out.println(num); // actual work
            num++; // updating the condition
        }

        System.out.println("-----------------");

        // 2. while loop (500 down to 400)
        int count = 500;
        while (count >= 400) {
            System.out.println(count);
            count -= 1;
        }

        System.out.println("-----------------");

        // 3. while loop with user input (5 numbers)
//        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
//            System.out.print("Enter number: ");
//            int inp = input.nextInt(); // waits for user input
//            System.out.println("Number is: " + inp);
            i++;
        }
        //  input.close(); // good practice
        System.out.println("-----------------");


        // 4. do while loop (1 to 80)
        int num1 = 1;
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= 80);

        System.out.println("-----------------");


        // for Loop

//        for(initialization; ciondition; update){
//            // code
//        }

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        /*
        1
        10
        100
        1000
        10000
        100000
         */

        for (int ii = 1, jj = 1; jj <= 6; ii = ii * 10, jj++) {
            System.out.println( ii );
        }
    }
}
