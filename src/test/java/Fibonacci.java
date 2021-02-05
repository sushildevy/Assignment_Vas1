public class Fibonacci {
    public static void DisplayFibonacci(int num){
        int n = 100, t1 = 1, t2 = 1;

        System.out.print("Fibonacci till " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }
    public static void main(String[] args) {
        DisplayFibonacci(100);
    }
}
