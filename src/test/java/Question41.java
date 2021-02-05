public class Question41 {
    public static void main(String[] args) {
        String str="Babblluu";
        System.out.println("Duplicate letters: ");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if (str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                }
            }
        }
    }
}
