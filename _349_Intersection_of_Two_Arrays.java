import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
    //    //solution 1
        Set<Integer> n = new HashSet<>();
        for (int i : nums1) {
            n.add(i);
        }

        Set<Integer> m = new HashSet<>();
        for (int i : nums2) {
            if (n.contains(i)) {
                m.add(i);
            }
        }

        int[] result = new int[m.size()];
        int index = 0;
        for (int i : m) {
            result[index++] = i;
        }

        return result;

        //solution 2
        // Set<Integer> n = new HashSet<>();
        //     for (int i : nums1) {
        //         n.add(i);
        //     }
        
        // int index = 0;
        // for (int i : nums2) {
        //     if (n.contains(i)) {
        //         nums2[index++] = i;
        //         n.remove(i);
        //     }

        // }
        // nums2 = Arrays.copyOf(nums2, index);
        // return nums2;
    }
}