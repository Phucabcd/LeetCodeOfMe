import java.util.Collections;
import java.util.PriorityQueue;

public class _1046_Last_Stone_Weight {
    //solution 1 : sort the array and use two pointers to find the last stone weight
    // edit....

    //solution 2: use a maxHeap
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int one = maxHeap.poll();
            int two = maxHeap.poll();
            if(one != two){
                maxHeap.add(one - two);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
