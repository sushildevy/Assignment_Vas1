import java.util.Scanner;

public class Areacalculation {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        double areaOfCircle=0;
        final double value_Of_Pi=3.147;
        while(areaOfCircle>=0){
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
            areaOfCircle=(value_Of_Pi*radius*radius);
            System.out.println("The area of circle is "+ areaOfCircle);
            double area_Of_Rectangle=2*length*breadth;
            System.out.println("The area of rectangle is "+ area_Of_Rectangle);
            double area_Of_Triangle=Math.sqrt(perimeter*(perimeter-length1)*(perimeter-length2)*(perimeter-length3));
            System.out.println("The area of a triangle is "+area_Of_Triangle);

        }
    }
}
