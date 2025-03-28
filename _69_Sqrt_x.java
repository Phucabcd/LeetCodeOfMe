public class _69_Sqrt_x {
    public int mySqrt(int x) {
        // dùng hàm có sẵn của java
        // int ans = (int)Math.sqrt(x);
        // return ans;

        //nhuc dau
        if(x == 0 || x == 1) return x;

        float n = x / 2;
        float resultN;
        
        while (true) {
            resultN = n;
            n = 0.5f * (n + x / n);
            if(Math.abs(n - resultN) < 0.0001){
                break;
            }
        }
        int check = (int) n;
            if(check * check > x){
                check--;
                return check;
            }
            
        return (int) n;
    }
}