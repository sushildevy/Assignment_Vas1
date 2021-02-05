import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("please enter the temperature in fahrenheit: ");
            double temp_In_Fahrenheit=sc.nextDouble();
            System.out.println("please enter the temperature in celsius: ");
            double temp_In_Celsius=sc.nextDouble();
            double fahrenToCelsius= (temp_In_Fahrenheit-32)*5/9;
            double celsius_To_Fahren=(temp_In_Celsius*9/5)+32;
            System.out.println("The celsius value of given fahrenheit temperature is: "+fahrenToCelsius);
            System.out.println("The fahrenheit value of given celsius temperature is: "+celsius_To_Fahren);

        }


    }
}
