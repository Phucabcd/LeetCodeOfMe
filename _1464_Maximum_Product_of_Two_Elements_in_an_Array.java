// import java.util.Collections;
import java.util.PriorityQueue;

public class _1464_Maximum_Product_of_Two_Elements_in_an_Array {
    public int maxProduct(int[] nums) {
        //solution 1 : same 1046 use maxheap 
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int num : nums){
           pq.add(num);
        }

        int first = pq.poll();
        int second = pq.poll();

        return (first - 1) * (second - 1);
    }
}
