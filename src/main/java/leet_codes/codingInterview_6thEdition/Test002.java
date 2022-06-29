package leet_codes.codingInterview_6thEdition;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
《程序员面试金典 第6版》
002.判定是否互为字符重排
给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
示例 1：
输入: s1 = "abc", s2 = "bca"
输出: true
示例 2：
输入: s1 = "abc", s2 = "bad"
输出: false
说明：
0 <= len(s1) <= 100
0 <= len(s2) <= 100
 */
public class Test002 {
    //方法一：转换成数组并使用sort进行重排
    public boolean CheckPermutation01(String s1, String s2) {
        if ((s1==null||"".equals(s1)) && (s2==null||"".equals(s2))){//同时为空
            return true;
        }else if ((s1==null||"".equals(s1)) || (s2==null||"".equals(s2))){//有一个为空
            return false;
        }else if (s1.length()!=s2.length()){//都不为空，但长度不相等
            return false;
        }else if (s1.equals(s2)) {//完全相同直接返回true
            return true;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        s1 = new String(c1);
        s2 = new String(c2);
        return s1.equals(s2);
    }

    //法二：map计数,map.getOrDefault的运用是重点
    public boolean CheckPermutation02(String s1, String s2) {
        if ((s1==null||"".equals(s1)) && (s2==null||"".equals(s2))){//同时为空
            return true;
        }else if ((s1==null||"".equals(s1)) || (s2==null||"".equals(s2))){//有一个为空
            return false;
        }else if (s1.length()!=s2.length()){//都不为空，但长度不相等
            return false;
        }else if (s1.equals(s2)) {//完全相同直接返回true
            return true;
        }
        Map<Character,Integer> mapS1 = getMap(s1);
        Map<Character,Integer> mapS2 = getMap(s2);
        char[] chars = s1.toCharArray();
        for (char c : chars){
            if (!mapS2.containsKey(c) || mapS1.get(c) != mapS2.get(c)){
                return false;
            }
        }
        return true;
    }
    public Map<Character,Integer> getMap(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }

    //方法三:筒计数,和上面的map计数类似 ,但是容器采用的是数组,更高效.因为char是基础类型所以方便很多
    public boolean CheckPermutation03(String s1, String s2) {
        if ((s1==null||"".equals(s1)) && (s2==null||"".equals(s2))){//同时为空
            return true;
        }else if ((s1==null||"".equals(s1)) || (s2==null||"".equals(s2))){//有一个为空
            return false;
        }else if (s1.length()!=s2.length()){//都不为空，但长度不相等
            return false;
        }else if (s1.equals(s2)) {//完全相同直接返回true
            return true;
        }
        int[] ints1 = countArr(s1);
        int[] ints2 = countArr(s2);
        for (int i = 0; i < ints1.length; i++){
            if (ints1[i] != ints2[i]){
                return false;
            }
        }
        return true;
    }
    public int[] countArr(String s){
        int[] ints = new int[26];
        char[] chars = s.toCharArray();
        for(char c : chars){
            ints[c-'a'] ++;//对下标所在值+1操作
        }
        return ints;
    }

    //执行
    public static void main(String[] args) {
        Test002 test = new Test002();
        long timeStamp1 = System.currentTimeMillis();
        boolean flag1 = test.CheckPermutation01("abcd","acbd");
        long timeStamp2 = System.currentTimeMillis();
        System.out.println("方法一[执行结果:"+flag1+",执行时间:"+ (timeStamp2-timeStamp1)+"ms]");
        timeStamp1 = System.currentTimeMillis();
        boolean flag2 = test.CheckPermutation02("abcd","acbd");
        timeStamp2 = System.currentTimeMillis();
        System.out.println("方法二[执行结果:"+flag2+",执行时间:"+ (timeStamp2-timeStamp1)+"ms]");
        timeStamp1 = System.currentTimeMillis();
        boolean flag3 = test.CheckPermutation02("abcd","acbd");
        timeStamp2 = System.currentTimeMillis();
        System.out.println("方法三[执行结果:"+flag3+",执行时间:"+ (timeStamp2-timeStamp1)+"ms]");
    }
}
