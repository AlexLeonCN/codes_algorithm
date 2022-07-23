package leet_codes.main_bank;

import java.util.*;

public class LeetCodes0003 {
    public int lengthOfLongestSubstring1(String s) {
        String result = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int index = temp.indexOf(String.valueOf(s.charAt(i)));
            if (index >= 0) {//已存在
                if (temp.length() >= result.length()) result = temp.toString();
                temp = new StringBuilder(temp.substring(index + 1,temp.length()));
                temp.append(String.valueOf(s.charAt(i)));
            }else {
                temp.append(String.valueOf(s.charAt(i)));
            }
        }
        if (temp.length() >= result.length()) result = temp.toString();
        return result.length();
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            if (set.contains(c)) {
                max = (r-l) > max ? (r-l) : max;
                l = s.indexOf(c, l) + 1;
                r = l;
                set.clear();
            }else {
                set.add(c);
                r++;
            }
        }
        max = (r-l) > max ? (r-l) : max;
        return max;
    }
}
