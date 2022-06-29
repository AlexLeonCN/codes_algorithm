package leet_codes.main_bank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeetCodes0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(lengthOfLongestSubstring(str));
        }
    }
    public static int lengthOfLongestSubstring(String s) {
        //"dvdf"
        //"abcdbce"
        Set set = new HashSet<Character>();
        int length = 0;
        int n = s.length();
        for (int l = 0; l < s.length(); l++){//左指针
            if (l!=0){//左指针移动，删除相应元素
                set.remove(s.charAt(l-1));
            }
            for (int r = 0; r < s.length();r++){

            }
        }
        return length;//最后还要比对一下head和l，因为可能最后一段字符串比之前的长
    }
}
