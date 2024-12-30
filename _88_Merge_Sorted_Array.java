public class _88_Merge_Sorted_Array {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2) {
            chenPhanTuVaoMang(ai, n1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] n1, int m) {
        boolean timK = false; 
        for (int i = 0; i < m; i++) {
            if(n1[i] > x){
                timK = true;
                
                for (int j = m-1; j >= i; j--) {
                     n1[j+1] = n1[i];
                }
                n1[i] = x;
                break;
            }
        }    

        if (timK == false) {
            n1[m] = x;
        }
        
    }

    public static void main(String[] args) {
        int[] n1 = {0,1,3,0,0,0};
        int[] n2 = {4,6,3};

        merge(n1, 0, n2, 0);
        System.out.println("Done: " );
    }
}
