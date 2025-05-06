// import java.util.Arrays;

import java.util.PriorityQueue;

public class _215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        //solution 1: sort 
        // Arrays.sort(nums);
        // return nums[nums.length - k];
        
        //solution 2: max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int num : nums){
            pq.add(num);
        }

        for(int i = 0; i < k - 1; i++){
            pq.poll();
        }

        return pq.peek();
    }
}