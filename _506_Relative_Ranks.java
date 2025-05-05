import java.util.PriorityQueue;

public class _506_Relative_Ranks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i = 0; i < n; i++){
            pq.add(new int[]{score[i], i});
        }

        String res[] = new String[n];
        int rank = 1;

        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int index = top[1];
            if(rank == 1) res[index] = "Gold Medal";
            else if(rank == 2) res[index] =  "Silver Medal";
            else if(rank == 3) res[index] =  "Bronze Medal";
            else res[index] = String.valueOf(rank);
            rank++;
        }

        return res;
    }
}
