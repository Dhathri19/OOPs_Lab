
public class StringModification{
    public static void main(String args[]){
        String s1 = "Dhathri";
        String s2 = "Random";

        /*CharAt*/
        System.out.println("CharAt: " + s1.charAt(0));

        /*compareTo*/
        System.out.println("compareTo: " + s1.compareTo(s2));

        /*compareToIgnoreCase*/
        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2));

        /*concat*/
        System.out.println("concat: " + s1.concat(s2));

        /*endswith*/
        System.out.println("endswith: " + s1.endsWith("i"));

        /*equals*/
        System.out.println("equals: " + s1.equals(s2));

        /*equalsIgnoreCase*/
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

        /*getBytes*/
        System.out.print("getBytes: ");
        byte[] byteArray;
        byteArray = s1.getBytes();
        for (int i = 0; i < byteArray.length; i++){
    		System.out.print(byteArray[i]);
    	}

        System.out.print("\n");

        /*getChars*/
        char[] ch1 = new char[10];  
        System.out.println("getChars: ");
        s1.getChars(2, 4, ch1, 3);
        System.out.println(ch1);

        /*indexOf*/
        System.out.println("indexOf: " + s1.indexOf('t'));

        /*isempty*/
        System.out.println("isempty: " + s1.isEmpty());

        /*lastIndexOf*/
        System.out.println("lastIndexOf: " + s1.lastIndexOf('i'));

        /*RegionMatches*/
        String str1 = "Specific student of CSE and CM";
        String str2 = "Compares a specific region inside a string";
        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        boolean match2 = str2.regionMatches(9, str2, 9, 8);
        System.out.println("Str1[0 - 7] == Str2[28 - 35]: " + match1);
        System.out.println("Str1[9 - 15] == Str2[9 - 15]: " + match2);

        /*replace*/
        System.out.println("Replace: " + s1.replace('a','z'));

        /*startsWith*/
        System.out.println("startsWith: " + s1.startsWith("Dha"));

        /*subsequence*/
        System.out.println("subsequence: " + s1.subSequence(2, 5));

        /*subString*/
        System.out.println("substring: " + s1.substring(2, 5));

        /*Tochar*/
        System.out.println("ToChar: ");
        
        char[] ch = s1.toCharArray();
        for(int i = 0; i < ch.length; i++){
            System.out.print(ch[i]);
        }

        System.out.print("\n");

        /*toLowerCase*/
        System.out.println("LowerCase: " + s1.toLowerCase());

        /*toString*/
        System.out.println("String: " + s1.toString());

        /*toUpperCase*/
        System.out.println("UpperCase: " + s1.toUpperCase());

        /*trim*/
        System.out.println("Trim: " + s1.trim());

        /*ValueOf*/
        Double c = Double.valueOf(5);
        System.out.println("Value of: " + c);

    }
}