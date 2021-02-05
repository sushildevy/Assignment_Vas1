public class Question37 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{4,5,6},{2,7,8},{3,1,9}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];    //use - for subtraction
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }


    }
}
