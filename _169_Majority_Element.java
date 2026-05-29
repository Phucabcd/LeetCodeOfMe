import java.util.HashMap;

public class _169_Majority_Element {
       public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int num : nums){
            //i checked if the number is exists i put current count + 1 if not i put 1
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
           
            // after i put the count. i'll get and check   
            int count = map.get(num);
            if(count > n / 2){
                return num;
            }
            
        }
        
        return -1;
    }
}