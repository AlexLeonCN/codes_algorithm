package utils;

public class OutputUtils {
    /*
    打印abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ
     */
    public String outputAToZ(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++){
            char c = (char)(i + 'a');
            sb.append(c);
        }
        String s = sb.toString();
        s += s.toUpperCase();
        return s;
    }
    public static void main(String[] args) {
        OutputUtils outputUtils = new OutputUtils();
        String s = outputUtils.outputAToZ();
        System.out.println(s);
    }
}
