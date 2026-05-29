import java.util.Set;
import java.util.HashSet;

class Solution {

    private int getNext(int n) {
    // Your logic here:
    // 1. Initialize sum = 0
        int sum = 0;
    // 2. Loop while n > 0
    while (n > 0){
        int digit = n % 10;
        sum += digit * digit;
    // 3. Extract digit, square it, add to sum
    // 4. Remove digit from n
        n /= 10;
    }
    // 5. Return sum
    return sum;
}

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n); // remember currently number.
            n = getNext(n); // Keep move to next number while N = 1 or Set contains n.
        }

        //The Long way (Explitcit If/else)
        /*
            if (n == 1) {
                return true;
            } else {
                return false;
        }
        */
        //The shorter way (Direct Return)
        return n == 1;
        
    }
}

