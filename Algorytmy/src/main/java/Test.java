import algorithmbook.StdOut;

import static java.lang.Math.pow;

public class Test {

    public static void main(String[] args) {
        //Zad.1.1.2
    //    System.out.println(String.valueOf(pow(2.0,-6)*100000000.1));
    //   System.out.println(String.valueOf(true || true ));
    //    equalArgym(2,7,2);
    //    xAndYInLim(0.1,0.1);
    //    whichDataDisplayProgram();
       // checkA();
      //  checkB();
       // checkC();
  //  System.out.println("a"+"b");
   // integerToBinaryString(7);
   // showTable();
//whatWillBe();

        int[][] ints = new int[][]{{1,3},{4,5}};
        transpMatrix(ints);

    }

    //Zad. 1.1.3
    public static void equalArgym(int a, int b, int c){
        if(a==b && b==c && c==a){
            System.out.println("Rowne");
        }else{
            System.out.println("Nie rowne");
        }
    }

    //Zad. 1.1.5
    public static void xAndYInLim(double a,double b){
        if(a>=0 && b>=0 && a<=1.0 && b<=1.0){
            System.out.println("Rowne");
        }else{
            System.out.println("Nie rowne");
        }
    }
    //Zad.1.1.6
    public static void whichDataDisplayProgram(){
        int f=0;
        int g=1;
        for(int i=0; i<=15;i++){
            StdOut.println(f);
            f=f+g;
            g=f-g;
        }
    }

    //Zad.1.1.7
    public static void checkA(){
        double t=9.0;
        while(Math.abs(t-9.0/t)>0.001){
            t=(9.0/t+t)/2.0;
            StdOut.printf("%.5f\n",t);
        }

    }

    public static void checkB(){
        int sum =0;
        for(int i =1; i<1000; i++){
            for(int j =0;j<i;j++){
                sum++;
            }
        }
        StdOut.println(sum);

    }

    public static void checkC(){
        int sum =0;
        for(int i =1; i<1000; i*=2){
            for(int j =0;j<1000;j++){
                sum++;
            }
        }
        StdOut.println(sum);

    }

    //1.1.9

    public static void integerToBinaryString(int N){
        String s ="";
        for(int n=N;n>0;n/=2){
            s=(n%2)+s;
        }
        System.out.println(s);
    }
//1.1.11
    public static void showTable(){
        String[][] logical = new String[4][4];
        for (int i =0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==i%2 && j==j%2){
                    logical[i][j]=i + j + "*";
                }else{
                    logical[i][j]=i+ j+ " ";
                }
                System.out.println(logical[i][j]);
            }
        }

    }

    //1.1.12
    public static void whatWillBe(){
        int[] a = new int [10];
        for(int i = 0;i<10;i++){
            a[i] =9 -i;
        }
        for(int i=0;i<10; i++){
            a[i]=a[a[i]];
        }
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    //1.1.13.

    public static int [][] transpMatrix(int[][] matrix){
        int row = matrix.length;
        int col=matrix[0].length;
        System.out.println(col);
        System.out.println(row);
        int[][] intsConvert = new int[col][row];
       //

        System.out.println(intsConvert[0].length);
        for(int i=0;i<row;i++) {
            for (int j = 0; i < col; j++) {
                intsConvert[j][i] = matrix[i][j];
                System.out.println(intsConvert[i][j]);
            }
        }
        return intsConvert;


    }


}
