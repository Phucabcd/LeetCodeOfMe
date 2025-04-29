public class _125_Valid_Palindrome {
    //solution 1: Two Pointers
    // low-performance because use toLowerCase() and replaceAll()
    // public boolean isPalindrome(String s) {
    //     s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    //     if(s == null) return true;
    //
    //     int left = 0, right = s.length() - 1;
    //
    //     while(left < right){
    //         if(s.charAt(left) != s.charAt(right)){
    //             return false;
    //         }    
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }

    //solution 2: StringBuilder
    // better performance than solution 1  
    public boolean isPalindrome(String s) {
        if(s == null) return true;
        
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        s = sb.toString();
        int left = 0, right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }    
            left++;
            right--;
        }
        return true;
    }
}
