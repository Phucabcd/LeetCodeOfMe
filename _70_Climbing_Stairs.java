public class _70_Climbing_Stairs {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        
        int step1 = 1, step2 = 2;

        for(int i = 2; i < n; i++){
            int temp = step1;
            step1 = step2;
            step2 = temp + step2;
        }
        return step2;
    }
}