package hints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Stream()将List转化为数组
 */
public class Hint003 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i ++){
            list.add((int)(Math.random()*100));
        }
        int[] intArr = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(intArr));
    }
}
