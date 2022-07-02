package leet_codes.main_bank;

public class LeetCodes0034 {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        int hint = 0;
        for (int i = 0; i < nums.length; i++){
            if (target == nums[i] && hint == 0) {
                start = i;
                end = i;
                hint++;
                if (i != nums.length -1 && nums[i+1] != nums[i]) {
                    break;
                }
                continue;
            }
            if (target == nums[i]) end++;
        }
        return new int[]{start,end};
    }
    public int[] searchRange2(int[] nums, int target) {
        int start = -1;
        int end = -1;
        //重点在于start的查找， 二分查找效率较快
        int l = 0, r = nums.length - 1, m;
        while (l <= r){
            m = (l + r) >>> 1;
            if (nums[m] == target) {
                start = m;
                end = m;
                break;
            }else if (nums[m] > target) {
                r = m - 1;
            }else {
                l = m + 1;
            }
        }
        if (start != -1) {
            while (true){
                if (start > 0 && nums[start-1] == nums[start]){
                    start -= 1;
                }else {
                    break;
                }
            }
            while (true){
                if (end < nums.length - 1 && nums[end + 1] == nums[end]){
                    end += 1;
                }else {
                    break;
                }
            }
        }
        return new int[]{start,end};
    }
}
