//Recursion in java.
import java.util.*;
class Recursion{
    static int factorial(int n) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+ num + " = " + factorial(num));
    }
    /*Factorial using recursion. Recursion means calling it again and again.*/
}
