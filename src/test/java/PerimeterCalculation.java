import java.util.Scanner;

public class PerimeterCalculation {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        final double value_Of_Pi=3.147;
        while(true){
            System.out.println("please enter the radius of circle: ");
            double radius=Sc.nextDouble();
            System.out.println("please enter the length and breadth of rectangle: ");
            double length =Sc.nextDouble();
            double breadth=Sc.nextDouble();
            System.out.println("please enter the lengths of a triangle: ");
            double length1=Sc.nextDouble();
            double length2=Sc.nextDouble();
            double length3=Sc.nextDouble();
            double perimeter=(length1+length2+length3)/2;
            double perimeterOfCircle=2*(value_Of_Pi*radius);
            System.out.println("The perimeter of circle is "+ perimeterOfCircle);
            double perimeter_Of_Rectangle=2*(length+breadth);
            System.out.println("The perimeter of rectangle is "+ perimeter_Of_Rectangle);
            double perimeter_Of_Triangle=length1+length2+length3;
            System.out.println("The area of a triangle is "+perimeter_Of_Triangle);

        }
    }
}
