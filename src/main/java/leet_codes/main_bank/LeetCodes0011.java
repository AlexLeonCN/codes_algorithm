package leet_codes.main_bank;

public class LeetCodes0011 {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = i + 1; j < height.length ; j++) {
                area = Math.max(area, Math.min(height[i], height[j])*(j-i));
            }
        }
        return area;
    }
    public int maxArea2(int[] height) {
        int area = 0;
        int l = 0;
        int r = height.length - 1;
        while (l != r){
            if (height[l] >= height[r]){
                area = Math.max(area, height[r]*(r-l));
                r--;
            }else {
                area = Math.max(area, height[l]*(r-l));
                l++;
            }
        }
        return area;
    }
}
