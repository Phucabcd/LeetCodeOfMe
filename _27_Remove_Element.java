public class _27_Remove_Element {
    //2 vong lap for 
    // public int removeElement(int[] nums, int val) {
    //     int n = nums.length;

    //     for (int i = 0; i < n;) {
    //         if (nums[i] == val) {
    //             for (int j = 0; j <= n - 2; j++) {
    //                 nums[j] = nums[j + 1];
    //             }
    //             n--;
    //         }else{
    //             i++;
    //         }
    //     }
    //     return 0;
    // }

    //2 con tro
    public int removeElement2(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {   
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        return k;
    }



    public static void main(String[] args) {

    }
}
