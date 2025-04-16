

public class _374_Guess_Number_Higher_or_Lower {
    public int guess(int num) {
        int p = 0;
        if (num > p) return -1;
        if (num < p) return 1;
        return 0;
    }

    public int guessNumber(int n) {
        int l = 0;
        int r = n;

        while(l < r){
            int m = l + (r - l) / 2;
            int res = guess(m);
            if (res == 0)
                return m;
            if (res == -1)
                r = m - 1;
            if (res == 1)
                l = m + 1;
        }

        return -1;
    }
}
