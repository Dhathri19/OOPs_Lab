import java.util.*;
class ForLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.println(i);
        }
    }
}