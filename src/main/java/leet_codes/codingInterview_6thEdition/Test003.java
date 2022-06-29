package leet_codes.codingInterview_6thEdition;

/*
《程序员面试金典 第6版》
003.URL化
URL化。编写一种方法，将字符串中的空格全部替换为%20。
假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 */
public class Test003 {
    //方法1：最快的解法但是不符合题意
    public String replaceSpaces(String S, int length) {
        S = S.substring(0,length).replaceAll(" ","%20");
        return S;
    }
    //方法2：使用字符数组的方法
    public String replaceSpaces02(String S, int length) {
        if ("".equals(S)||null==S||0==length){
            return "";
        }
        char[] chars = S.toCharArray();
        char[] charResult = new char[3*length];//按照最大的来，以防不够
        int index = 0;//新字符数组的元素下标
        for (int i = 0 ; i < length; i++){
            if (' ' == chars[i]){//如果为空
                charResult[index++] = '%';
                charResult[index++] = '2';
                charResult[index++] = '0';
            }else{//不为空
                charResult[index++] = chars[i];
            }
        }
        return new String(charResult,0,index);
    }

    public static void main(String[] args) {
        Test003 test = new Test003();
        String s = test.replaceSpaces02("a b c   ",6);
        System.out.println(s);
    }
}
