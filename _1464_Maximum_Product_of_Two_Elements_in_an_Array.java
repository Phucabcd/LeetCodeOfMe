// import java.util.Collections;
// import java.util.PriorityQueue;

public class _1464_Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        //solution 1 : same 1046 use maxheap 
        //time complexity : O(nlogn) , space complexity : O(n)
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        // for(int num : nums){
        //    pq.add(num);
        // }

        // int first = pq.poll();
        // int second = pq.poll();

        // return (first - 1) * (second - 1);

        //solution 2 : 
        //time complexity : O(n) , space complexity : O(1)
        int max1 = 0, max2 = 0;

        for(int num : nums){
            if(max1 < num){
                max2 = max1;
                max1 = num;
            }else if(max2 < num){
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 -1);
    }
}
