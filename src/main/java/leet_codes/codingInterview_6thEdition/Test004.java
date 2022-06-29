package leet_codes.codingInterview_6thEdition;

import java.util.HashMap;
import java.util.Map;

/*
《程序员面试金典 第6版》
004.判断回文排列
给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
回文串不一定是字典当中的单词。
示例1：
输入："tactcoa"
输出：true（排列有"tacocat"、"atcocta"，等等）
 */
public class Test004 {
    /*
    思路：
    根据题意，需要判断给定字符串能否组成回文串
    回文串是正读反读都一样的字符串
    当字符数目为奇数时，那么单个字符的数量只能为1，其他必须是成对出现 比如aabbc,aaabb都可以组成回文串，其中aabbc中的c和aaabb中的a就属于单个未成对字符
    当字符数目为偶数时，不能出现单个未成对字符，每个字符都必须时偶数
    所以遍历字符数组，使用map计数的方法记录每个字符的数目，然后计算单个未成对字符的数量
    最后再分奇数和偶数两种情况去判断就可以了
     */
    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();
        int singleNum = 0;//落单的字符个数
        for (char c : chars){//遍历字符数组统计每个字符出现的数量
            int count =  (int)countMap.getOrDefault(c,0);
            countMap.put(c,++count);
        }
        for (Integer val : countMap.values()){//遍历计数map获得每个字符的总个数
            if (val%2!=0){//为奇数，则一定有一个字符是落单的
                singleNum ++;
            }
        }
        //偶数个字符的话，要求落单的字符数为0才是回文。奇数个字符的话，要求落单的字符数为1才是回文
        if ((s.length()%2==0 && singleNum == 0) || (s.length()%2 !=0 && singleNum == 1)){
            return true;
        }
        return false;
    }

    //优化版，去除了char[]， 数组比较占内存
    public boolean canPermutePalindrome02(String s) {
        Map<Character,Integer> countMap = new HashMap<>();
        int singleNum = 0;//落单的字符个数
        for (int i = 0; i < s.length(); i++){//遍历字符数组统计每个字符出现的数量
            countMap.put(s.charAt(i),countMap.getOrDefault(s.charAt(i),0)+1);
        }
        for (Integer val : countMap.values()){//遍历计数map获得每个字符的总个数
            if (val%2!=0){//为奇数，则一定有一个字符是落单的
                singleNum ++;
            }
        }
        //偶数个字符的话，要求落单的字符数为0才是回文。奇数个字符的话，要求落单的字符数为1才是回文
        if ((s.length()%2==0 && singleNum == 0) || (s.length()%2 !=0 && singleNum == 1)){
            return true;
        }
        return false;
    }
}
