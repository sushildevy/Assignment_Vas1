public class Question42 {
    public static void main(String[] args) {
        String str="Yo desh ko katha katha mai rahera desh eka desh ko hune vayo ";
        str=str.toLowerCase();
        String words[]=str.split(" ");

        System.out.println("duplicate words: ");
        for(int i=0;i<words.length;i++){
            int ct=1;
            for(int j=i+1;j<words.length;j++){
                if (words[i].equals(words[j])){
                    ct++;
                    words[j]="0";
                }
            }
            if(ct>1 && words[i]!="0"){
                System.out.println(words[i]);
            }
        }
    }
}
