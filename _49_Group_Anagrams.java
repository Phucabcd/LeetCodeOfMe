import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        //solution 1 : hashMap
        // HashMap<String, List<String>> map = new HashMap<>();

        // for(String str : strs){
        //     char[] chars = str.toCharArray();
        //     Arrays.sort(chars);
            
        //     String key = new String(chars);
        //     if(!map.containsKey(key)) map.put(key, new ArrayList<>());
        //     map.get(key).add(str);

        // //    String sort = Arrays.sort(str);
        // //    String key = sort.add(map.key());
        // //    if(!key.isEmpty()) str.add(map.value());
        // }

        // return new ArrayList<>(map.values());

        //solution 2 : array 26 types

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
