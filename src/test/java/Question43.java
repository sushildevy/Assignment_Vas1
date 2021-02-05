public class Question43 {
    public static void main(String args[])
    {
        try{
            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("Division by zero error");
        }

        try {
            int arr[]=new int [10];
            arr[11]=7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        }


    }
}
