import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("please, enter the number to find out table: ");
            int num=sc.nextInt();
            System.out.println("table of "+num);
            for (int i=1; i<=10; i++){
                System.out.println(num + " * "+ i +" = " + num*i);
            }
        }
    }
}
