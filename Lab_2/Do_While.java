import java.util.*;
class Do_While{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int i = 0;
        do{
            i++;
            System.out.println(i);
        }while(i < num);
    }
}
