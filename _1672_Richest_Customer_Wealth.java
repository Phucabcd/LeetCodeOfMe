public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] a) {
        int i = a.length;
        int j = a[0].length;

        int max = 0;

        for (int k = 0; k < i; k++) {
            int totalI = 0;
            for (int k2 = 0; k2 < j; k2++) {
                totalI += a[k][k2];
            }
            if(totalI > max){
                max = totalI;
            }
        }
        
        // for (int k3 = 0; k3 < i; k3++) {
        //     System.out.println("Total: " + k3 + " : " + result[k3]);
        //     if (result[k3] > max) {
        //         max = result[k3];
        //     }
        // }
        
        return max;
    }

    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},{3,2,1}};
      
       
        System.out.println(maximumWealth(accounts)); ;

    }
}