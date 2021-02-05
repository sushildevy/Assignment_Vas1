import java.util.Scanner;

public class NegNumTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("Please enter the negative number: ");
            int negNum=sc.nextInt();
            if(negNum<0){
                System.out.println("neg num: "+negNum);
            }
            else{
                System.out.println("Num is not negative: ");

            }

        }
    }

}
