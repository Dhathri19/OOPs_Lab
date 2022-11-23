import java.util.*;  
    class Double{  
        public static void main(String[] args){ 
            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream   
            double a= sc.nextDouble();  
            
            //Converting to double.
            String s=String.valueOf(a);  
            System.out.print("The string is: ");
            System.out.println(s);

            //Length of string
            System.out.print("The length is: ");
            System.out.println(s.length());

    }  
}  