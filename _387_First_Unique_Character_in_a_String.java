import java.util.HashMap;

public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
      // solution 1
      // for (int i = 0; i < s.length(); i++) {
      //   char currentChar = s.charAt(i);
      //   if (s.indexOf(currentChar) == s.lastIndexOf(currentChar)) {
      //       return i; 
      //   }
      // }
      //  return -1;

      //solution 2 for
      // for (int i = 0; i < s.length(); i++) {
      //   char currentChar = s.charAt(i);
      //   boolean isUnique = true;

      //   for (int j = 0; j < s.length(); j++) {
      //       if (i != j && currentChar == s.charAt(j)) {
      //           isUnique = false;
      //           break;
      //       }
      //   }

      //   if (isUnique) {
      //       return i;
      //   }
      // }
      // return -1;

      //solution 3 HashMap
      HashMap<Character, Integer> map = new HashMap<>();
      for(char c : s.toCharArray()){
        map.put(c, map.getOrDefault(c, 0) + 1);
      }
      for (int i = 0; i < s.length(); i++) {
        if (map.get(s.charAt(i)) == 1) {
          return i;
        }
      }
      return -1;
    }

   
}
