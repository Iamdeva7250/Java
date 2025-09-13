
import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the swappinng program");
        System.out.println("Enter the first number : ");
        int a = input.nextInt();
        System.out.println("Enter the second value : ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping isss Done..");
        System.out.println("the value of a is :" + a);
        System.out.println("the value of b is :" + b);

    }
}
