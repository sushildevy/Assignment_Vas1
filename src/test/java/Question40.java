import java.util.Scanner;

public class Question40 {
    public static void main(String [] args){
        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the string to reverse: ");
            String string=sc.nextLine();
            String reverseString="";
            for(int i =string.length()-1;i>=0;i--){
                reverseString=reverseString+string.charAt(i);

            }
            System.out.println("Reverse of the string: " + reverseString);
        }
    }
}
