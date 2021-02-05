package Question10;

import javax.swing.*;

public class Question10a {
    public static void main(String[] args) {
        String aa= JOptionPane.showInputDialog("Enter u");
        double u=Double.parseDouble(aa);
        String bb= JOptionPane.showInputDialog("Enter a");
        double a=Double.parseDouble(bb);
        String cc= JOptionPane.showInputDialog("Enter t");
        double t=Double.parseDouble(cc);
        double s= u*t+0.5*(a*t*t);
        System.out.println("S value is "+ s);



    }
}
