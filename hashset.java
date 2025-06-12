import java.util.*;

public class hashset {
    public List<List<Integer>> threeSum(int[] nums) {                       
                HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -nums[i] - nums[j];
                if (seen.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet); 
                    result.add(triplet);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}
