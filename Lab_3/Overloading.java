import java.lang.Math;
class Method1{
    static int area(int a, int b){
        int area1 = a * b;//Rectangle
        return area1;
    }
    static int area(int a){
        int area2 = a * a;//Square
        return area2;
    }
    static double area(int b, int h, double some){
        double area3 = b * h * some;//Triangle
        return area3;
    }
    static double area(int d1, int d2, double some1, int temp){
        double area4 = d1 * d2 * some1;//Rhombus
        return area4;
    }
    static int area(int base, int height, int temp1, int temp2, int temp3){
        int area5 = base * height;//Parallelogram
        return area5; 
    }
    static double area(float base, int height, double some3, int temp4, int temp5, int temp6){
        double area6 = some3 * base * height;//ellipse
        return area6; 
    }
    static float perimeter(int a, int b){
        float per1 = 2 * (a + b);//Rectangle
        return per1;
    }
    static float perimeter(int a){
        float per2 = 4 * a;//Square
        return per2;
    }
    static float perimeter(int a, int b, int c){
        float per3 = a + b + c;//Triangle
        return per3;
    }
    static float perimeter(int a, int temp, int temp2, int temp3){
        float per4 = 4*a;//Rhombus
        return per4;
    }
    static float perimeter(int a, int b, int temp4, int temp5, int temp6){
        float per5 =  4*(a + b);//Paralellogram
        return per5; 
    }
    static double perimeter(int a, int b, int temp7, int temp8, int temp9, int temp10){
        double per6 = 2*3.14*Math.sqrt((Math.pow(a,2) + Math.pow(b,2))/2);//ellipse
        return per6; 
    }
}
class Overloading{  
    public static void main(String[] args){  
        Method1 M1 = new Method1();
        System.out.println("Area of rectangle " + M1.area(11,11));  
        System.out.println("Area of square " + M1.area(11));  
        System.out.println("Area of triange " + M1.area(11,11,0.5));  
        System.out.println("Area of rhombus " + M1.area(11,11,0.5,1));  
        System.out.println("Area of paralellogram " + M1.area(11,11,1,1,1));  
        System.out.println("Area of ellipse" + M1.area(11,11,3.14,1,1,1)); 
        System.out.println("Perimeter of rectangle " + M1.perimeter(11,11));  
        System.out.println("Perimeter of square " + M1.perimeter(11));  
        System.out.println("Perimeter of triangle " + M1.perimeter(11,11,11));  
        System.out.println("Perimter of rhombus " + M1.perimeter(11,1,1,1,1));  
        System.out.println("Perimter of paralellogram " + M1.perimeter(11,11,1,1,1));  
        System.out.println("Perimeter of ellipse " + M1.perimeter(11,11,1,1,1,1));  
    }
}
