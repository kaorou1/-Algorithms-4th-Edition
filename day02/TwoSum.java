import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 4, 2}, 6)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ans[0] = i;
            if (map.containsKey(target-nums[i])){
                ans[1] = map.get(target-nums[i]);
                return ans;
            }else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }

}
