public class _67_Add_Binary {
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder stringBuilder = new StringBuilder();
            int result = 0;
            int i = a.length() - 1;
            int j = b.length() - 1;
            while (i >= 0 || j >= 0 || result == 1) {
                if (i >= 0) {
                    // result += a.charAt(i--) - '0';
                }
                if (j >= 0) {
                    // result += b.charAt(j--) - '0';
                }
                // stringBuilder.append(result % 2);
                // result /= 2;
            }
             return stringBuilder.reverse().toString();
        }
    } 
}