import java.util.HashMap;

public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
      for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);
        if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
            return i; 
        }
      }
       return -1;
    }

    public static void main(String[] args) {
        
    }
}
