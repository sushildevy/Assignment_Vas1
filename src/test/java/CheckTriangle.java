import java.util.Scanner;

public class CheckTriangle {
    static void checkTriangle(int x, int y , int z){
        if (x == y && y == z )
            System.out.println("Equilateral Triangle");

        else if (x == y || y == z || z == x )
            System.out.println("Isosceles Triangle");

        else
            System.out.println("Scalene Triangle");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("please, enter three sides of triagle in integer form: ");
            int side1=sc.nextInt();
            int side2=sc.nextInt();
            int side3=sc.nextInt();
            checkTriangle(side1,side2,side3);
        }

    }
}
