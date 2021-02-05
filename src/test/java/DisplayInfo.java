import java.util.Scanner;

public class DisplayInfo {
    static void printForm(int roll, String name, String nationality){
        System.out.println("Roll:  "+ roll+  "\nName: "+name+ "\nNationality: "+ nationality);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
                System.out.println("please, enter the roll num: ");
                int roll =sc.nextInt();
            if(roll>=0){
                System.out.println("Please enter the name: ");
                String name=sc.next();
                if(name!=null){
                    System.out.println("Please, enter the nationality");
                    String nationality=sc.next();
                    if(nationality!=null){
                        printForm(roll,name,nationality);

                    }
                    else{
                        System.out.println("Nationality can not be blank");
                    }
                }else{
                    System.out.println("Name can not be empty ");

                }

            }
            else{
                System.out.println("the roll num is not correct");



            }

        }
    }
}
