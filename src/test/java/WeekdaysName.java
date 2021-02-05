import java.util.Scanner;

public class WeekdaysName {
    public static String getDayName( int day){
        String dayName="";
        switch(day){
            case 1:dayName="Monday";
                break;
            case 2:dayName="Tuesday";break;
            case 3:dayName="Wednesday";break;
            case 4:dayName="Thursday";break;
            case 5:dayName="Friday";break;
            case 6:dayName="Saturday";break;
            case 7:dayName="Sunday";break;
            default:
                System.out.println("The num is out of range, please enter again.");
        }
        return dayName;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("please, enter num for the name of day: ");
            int day = sc.nextInt();
            System.out.println(day +" -> "+ getDayName(day));

        }
    }
}

