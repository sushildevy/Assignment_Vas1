import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an ASCII code: ");
        int i = input.nextInt();

        // Display ASCII code as character
        System.out.println(i+ " -> "+ (char)i);
    }
}
