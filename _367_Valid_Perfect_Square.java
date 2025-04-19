public class _367_Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        //solution 1 
        // long i = 1;
        // while(i * i <= num){
        //     if(i * i == num) return true;
        //     i++;
        // }
        // return false;

        //solution 2 Binary Search
        long l = 1, r = num;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            long square = mid * mid;
            if (square == num) return true;
            else if (square < num) l = mid + 1;
            else r = mid - 1;
        }
        return false;

    }
}