import java.util.Scanner;

public class VolumeOfCylinder {
        public static void main(String[] args ){
            Scanner Sc = new Scanner(System.in);
            final double value_Of_Pi= 3.14;
            while (true){
                System.out.println("please enter the radius and height of cylinder: ");
                double radius =Sc.nextDouble();
                double height_Of_Cylinder=Sc.nextDouble();
                double volume_Of_cylinder=value_Of_Pi*radius*radius*height_Of_Cylinder;
                System.out.println("The volume of cylinder is: "+volume_Of_cylinder);

            }

        }

}
