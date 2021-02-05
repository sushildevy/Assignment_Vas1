package Question10;

import javax.swing.*;

import static java.lang.Math.sqrt;

public class Question10c {
    public static void main(String[] args) {
        while (true) {
            String s1 = JOptionPane.showInputDialog("Enter b");
            double b = Double.parseDouble(s1);
            String s2 = JOptionPane.showInputDialog("Enter a");
            double a = Double.parseDouble(s2);
            String s3 = JOptionPane.showInputDialog("Enter c");
            double c = Double.parseDouble(s3);
            double x = (-b + sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
            System.out.println("The value of x is: " + x);
        }
    }
}
