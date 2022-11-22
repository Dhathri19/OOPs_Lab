import java.lang.*;
class StringBufferDemo{
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("Dhathri");
        StringBuffer sb2 = new StringBuffer("Random");

        /*CharAt*/
        System.out.println("CharAt: " + sb1.charAt(0));

        /*SetChar*/
        sb1.setCharAt(1, 'i');
        System.out.println("SetCharAt: " + sb1);

        /*getChars*/
        char[] ch1 = new char[10];  
        System.out.println("getChars: ");
        sb1.getChars(2, 4, ch1, 3);
        System.out.println(ch1);

        /*append*/
        System.out.println("Append: " + sb1.append('o'));

        /*insert*/
        System.out.println("Insert: " + sb1.insert(4, 'c'));

        /*Replace*/
        System.out.println("Replace: " + sb1.replace(3, 5, "is"));

        /*Substring*/
        System.out.println("Substring: " + sb1.substring(2, 5));

        /*Reverse*/
        System.out.println("Reverse: " + sb1.reverse());

        /*Capacity*/
        System.out.println("Capacity: " + sb1.capacity());

        /*Ensure*/
        sb1.ensureCapacity(50);
        System.out.println("Ensure Capacity: " + sb1.capacity());

        /*Length*/
        System.out.println("Length: " + sb1.length());

        /*Delete*/
        System.out.println("Delete: " + sb1.delete(2, 5));
    }
}