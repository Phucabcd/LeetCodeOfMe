
public class _26_Remove_Duplicates_from_Sorted_Array {
    
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return n;
        }

        int i = 1; int j = 1;

        while (j < n) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
    }

}
