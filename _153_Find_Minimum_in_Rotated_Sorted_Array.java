public class _153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        while(l < r){
            int m = l + (r - l) / 2;

            if(nums[m] > nums[r]) {
                l = m + 1;
            }else{
                r = m;
            }
        }
        return nums[l];
    }
}
