import java.util.*;
class Summation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
		int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        do{
            i++;
            sum = sum + i;
            //System.out.println(sum);
        }while(i < num);

        System.out.println("Sum of numbers :" + sum);
    }
}
