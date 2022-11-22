import java.util.*;
class menuSelection{
	public static void main(String args[]){
		int flag = 0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the side: ");
			int side = sc.nextInt();
			System.out.println("Enter 1 for area of square");
			System.out.println("Enter 2 for perimeter of square");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Area is: " + (side * side));
					break;
				case 2:
					System.out.println("Perimeter is: " + (4 * side));
					break;
			}
			System.out.println("Would you like to continue? Enter 1 for yes, 2 for no:");
			Scanner sc1 = new Scanner(System.in);
			flag = sc1.nextInt();
		}while(flag == 1);
	}
}