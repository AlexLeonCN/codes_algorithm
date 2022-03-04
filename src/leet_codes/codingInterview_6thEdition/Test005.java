package leet_codes.codingInterview_6thEdition;
/*
《程序员面试金典 第6版》
005.一次编辑
字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
示例:
输入:
first = "pale"
second = "ple"
输出: True

示例2:
输入:
first = "pales"
second = "pal"
输出: False

示例3：
输入:
first="ab"
second="bc"
输出:false
 */
public class Test005 {
    public boolean oneEditAway(String first, String second) {
        //注意题意还有个'或者零次改动'
        if (first.equals(second)) return true;
        //同时为""的情况上面一行代码已经返回了，所以这里拦截到的是只有一个为空的情况, 判断另一个字符长度是不是1就行
        if ("".equals(first) || "".equals(second)) return (first.length()==1 || second.length()==1);
        //计算两个字符串的长度，以及长度差
        int n1 = first.length();
        int n2 = second.length();
        int diff = Math.abs(n1-n2);
        //1.两个字符的个数差距的绝对值必须小于等于1，超过1就一定发生了两次改动
        if (diff > 1) return false;
        //2.当字符长度相差1的时候，删除 或 插入
        //3.当字符长度相等，更改
        int changeTime = 0;
        int i = 0;//指向first的指针
        int j = 0;//指向second的指针
        while (i < first.length() && j < second.length()){//当任何一个字符串的指针大于它的长度时，括号里面就不为true了，就会跳出循环
            if (first.charAt(i) == second.charAt(j)){//字符相等,两个指针同时后移一位
                i++;
                j++;
            }else {
                changeTime++;//不想等，说明有改动，改动次数先+1， 然后操作指针
                if (n1 > n2){//字符串较长的，指针向后移动一位，短的指针不用移动，去匹配下一个字符，按理说下一个就相同了，因为长度不相等，要么被删除一位要么被插入一位
                    i++;
                }else if (n1 == n2){//有字符不想等的情况下，长度还一样，说明发生了改变，指针同时往后移动
                    i++;
                    j++;
                }else if (n1 < n2){//同理
                    j++;
                }
            }
        }
        return changeTime <= 1;
    }

    public static void main(String[] args) {
        Test005 test = new Test005();
        boolean flag = test.oneEditAway("ab","bc");
        System.out.println(flag);
    }
}
