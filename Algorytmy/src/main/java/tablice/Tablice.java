package tablice;

public class Tablice {
    public static void main(String[] args) {
        double[] a = new double[]{1,2,3,4,5};
        System.out.println(maxArrayValue(a));
        System.out.println(aveArrayValue(a));
        System.out.println(copyToAnotherArray(a).getClass().getName());
        System.out.println(flipOrder(a)[0]);

        double[][] b = new double[][]{{1,2,3,4,5},{5,4,3,2,1}};
        double[][] c = new double[][]{{6,7,8,9,2},{5,4,3,2,1}};
        System.out.println(multiMatrix(b,c)[0][1]);

    }


     static double maxArrayValue(double[] a){
        double max = a[0];
        for(int i=1;i<a.length;i++){
           if(a[i] >max){max = a[i];}
        }
         return max;
     }

     static double aveArrayValue(double[] a){
         int arrayLength = a.length;
         double sum =0.0;
         for(int i=0;i<arrayLength;i++){
             sum +=a[i];
         }
         return sum;
     }

     static double[] copyToAnotherArray(double[] a){
         int N = a.length;
         double[] b = new double[N];
         for(int i =0; i<N;i++){
             b[i] = a[i];
         }
         return b;
     }

     static double[] flipOrder(double[] a){
         int N = a.length;
         for(int i=0;i<N/2;i++){
             double temp = a[i];
             a[i] = a[N-1-i];
             a[N-1-i] = temp;
         }
         return a;
     }

     static double[][] multiMatrix(double[][] a, double[][] b){
         int N = a.length;
         double[][] c = new double[N][N];
         for(int i=0; i<N; i++){
             for(int j=0;j<N;j++){
                 for(int k=0;k<N;k++){
                     c[i][j] += a[i][k]*b[k][j];
                 }
             }
         }
         return c;
     }
}
