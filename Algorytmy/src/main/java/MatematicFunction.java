package tablice;

import algorithmbook.StdDraw;
import algorithmbook.StdRandom;

public class MatematicFunction {

    public static void main(String[] args) {
        System.out.println(absDouble(2.0));
        System.out.println(isPrime(6));
        System.out.println(sqrt(4.0));
        System.out.println(hypotenuse(4.0,3.0));
        System.out.println(harmonicNumber(5));
        System.out.println(randomDouble(3.0,6.0));
        double[] d = new double[]{9.0,4.0,7.0};
        System.out.println(randomDiscret(d));
        shuffle(d);

        printParabola();
}







    static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    static double absDouble(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    static double hypotenuse(double a, double b){
        return sqrt(a*a+b*b);
    }

    static double harmonicNumber(int N){
        double sum =0.0;
        for(int i=1;i<=N;i++){
            sum+=1.0/i;
        }
    return sum;
    }

    /*
    Liczby harmoniczne f(x) =1/x
     */

    static double randomDouble(double a,double b){
        return a + StdRandom.random()*(b-a);
    }

    static int randomDiscret(double[] a){
        double r =StdRandom.random();
        double sum =0.0;
        for(int i=0;i<a.length;i++){
            sum =sum + a[i];
           System.out.print("R " +r);
            if(sum>=r){
                return i;
            }

        }
        return -1;
    }

    static void shuffle(double[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int r = i + StdRandom.uniform(N-i);
            double temp = a[i];
            a[i] = a[r];
            System.out.println(a[r] = temp);
        }
    }

    static void printParabola() {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);

        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }



}



