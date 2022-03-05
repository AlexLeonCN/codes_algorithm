package leet_codes.main_bank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodes0001 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] res = twoSum2(nums,target);
        System.out.println(Arrays.toString(res));
    }
    static public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length -1;i++ ){
            for(int j = i+1; j < nums.length;j++){
                if (nums[i]+nums[j] == target) return new int[]{i,j};
            }
        }
        return new int[0];
    }

    static int[] twoSum2(int[]nums , int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return  new int[0];
    }
}
