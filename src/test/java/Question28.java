public class Question28 {
    public static boolean isPrimeNumber(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String PrimeNumbers(int tmpNum) {
        String primeNumbers="";
        int num=0;
        for (int i = 1; i <= tmpNum; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }

        }
        return primeNumbers;
    }
    //need to check
    public static String firstNthPrimeNum(int num){
        String firstPrimeNum="";
        for (int i=0;i<=num;i++){
           firstPrimeNum = PrimeNumbers(i);
        }
        return firstPrimeNum;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumbers(9));
        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber(8));
       // System.out.println(firstNthPrimeNum(5));


    }
}
