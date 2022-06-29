package leet_codes.codingInterview_6thEdition;

import java.util.HashMap;
import java.util.Map;

/*
《程序员面试金典 第6版》
001.判定字符是否唯一
实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
示例 1：
输入: s = "leetcode"
输出: false
示例 2：
输入: s = "abc"
输出: true
限制：
0 <= len(s) <= 100
如果你不使用额外的数据结构，会很加分。
 */
public class Test001 {
    //方法一：通过字符串indexOf方法判断
    public boolean isUnique01(String astr) {
        if(astr == null || "".equals(astr)){
            return true;
        }
        for(int i = 0; i<astr.length();i++){
            char a = astr.charAt(i);
            if(astr.lastIndexOf(a) != i){
                return false;
            }
        }
        return true;
    }

    //方法二：通过HashMap方式
    public boolean isUnique02(String astr) {
        if(astr==null || "".equals(astr)){
            return true;
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < astr.length(); i++){
            String a = String.valueOf(astr.charAt(i));
            if(map.containsKey(a)){
                return false;
            }else{
                map.put(a,i);
            }
        }
        return true;
    }

    //执行
    public static void main(String[] args) {
        Test001 test = new Test001();
        String input = "abcdefghijklmn";
        boolean output01 = test.isUnique01(input);
        boolean output02 = test.isUnique02(input);
        System.out.println(output01);
        System.out.println(output02);
    }
}
