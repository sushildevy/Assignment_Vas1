public class PatternDisplay {
    public static void Display(int num)
    {
        String tmp="";
        for (int i=1; i<=num;i++){
            tmp+=i;
            System.out.println(tmp);
        }
    }

    public static void main(String[] args){
        Display(8);


    }
}
