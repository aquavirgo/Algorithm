public class PrimitiveSearch {
    public static void main(String[] args) {
        int k=2;
        int[] a = new int[]{1,2,34,5};

        System.out.println(rank(2,a));

    }


    static int rank(int key,int[] a){
        for(int i =0;i<a.length;i++){
            if(a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
