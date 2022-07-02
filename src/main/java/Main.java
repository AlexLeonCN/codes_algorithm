import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/*
这是一个测试类
 */
public class Main {
    //冒泡排序练习
    public int[] bubbleSortExam(int[] input) {
        int[] nums = input.clone();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
        return nums;
    }

    //快排练习
    public int[] quickSortExam(int[] input) {
        int[] nums = input.clone();
        quickSort_execute_exam(nums,0,nums.length-1);
        return nums;
    }
    private void quickSort_execute_exam(int[] nums, int l, int r) {
        if (l < r) {
            int i = l, j = r ,x = nums[i];
            while (i < j) {
                while (i < j && nums[j] >= x) j--;
                if (i < j) nums[i++] = nums[j];
                while (i < j && nums[i] < x) i++;
                if (i < j) nums[j--] = nums[i];
            }
            nums[i] = x;
            quickSort_execute_exam(nums,l, i - 1);
            quickSort_execute_exam(nums, i + 1, r);
        }
    }

    /*上面是练习 - 下面是答案*/

    //冒泡排序
    public int[] bubbleSort(int[] input) {
        int[] nums = input.clone();
        for (int i = 0; i < nums.length - 1; i++) {//外层仅仅用于计数
            for (int j = 0; j < nums.length - i - 1; j++) {//内层每个循环都从头比对一次
                if (nums[j] > nums[j+1]) {
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }//发现后只相邻的互换一下，下循环再从头比对
            }
        }
        return nums;
    }



    //快排
    public int[] quickSort(int[] input) {
        int[] nums = input.clone();
        quickSort_execute(nums, 0, nums.length-1);
        return nums;
    }
    private void quickSort_execute(int[] nums, int l, int r){
        if (l < r){//左区间指针小于右区间指针
            int i = l,  j = r,  x = nums[l];
            //第一步：简单排序，使得nums[l]前面的都比他小，后面的都比他大
            while(i < j){//左区间指针小于右区间指针
                while(i < j && nums[j] >= x) j--;//对比的是右区间指针的元素,并将右区间指针不断向左移动
                //如果跳出循环，那么就是找到了比x小的，此时的j下标就获取到了
                if (i < j) nums[i++] = nums[j];//这里做了两步操作：1.nums[i]=nums[j] 2.i++
                while (i<j && nums[i] < x) ++i;//对比的是左区间指针的元素,并将左区间指针不断向右移动
                //如果跳出循环，那么就是找到了比x大的，此时i下标就获取到了
                if (i<j) nums[j--] = nums[i];//这里做了两步操作：1.nums[j]=nums[i] 2.j--
                //看到这里其实发现上面的步骤其实就是冒泡排序，x是中间变量，然后nums[i]=nums[j], nums[j]=nums[i]
            }
            nums[i] = x;//此时i其实在分界点
            //现在空间被分成两份，i之前左区间的肯定比x小，之后的右区间肯定比x大
            quickSort_execute(nums,l,i-1);
            quickSort_execute(nums,i+1,r);
        }
    }

    //二分查找
}
