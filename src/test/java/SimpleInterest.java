import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        double interest=0;
        System.out.println("Please inter principle(int), time(int) and rate(double)");
        while(interest>=0){
            int principle=Sc.nextInt();
            int time=Sc.nextInt();
            double rate =Sc.nextFloat();
            interest= (principle*time*rate)/12;
            System.out.println("The interest is "+ interest);
            System.out.println("Please inter principle(int) , time(int) and rate(double)");
        }
    }
}
