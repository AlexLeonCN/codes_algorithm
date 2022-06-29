package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        while (!sc.hasNext("#")){
//            int a = sc.nextInt();
//            list.add(a);
//        }
        for (int i= 0; i < 10; i++){
            int rd = (int)(Math.random()*10);
            list1.add(rd);
            list2.add(rd);
        }
        int[] intArr1 = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] intArr2 = list2.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Arr1排序前:"+Arrays.toString(intArr1));
        long start1 = System.currentTimeMillis();
        sort(intArr1,0, intArr1.length-1);
        long end1 = System.currentTimeMillis();
        System.out.println("Arr1排序后:"+Arrays.toString(intArr1));
        System.out.println("快排耗时:"+(end1-start1)+"ms");

        System.out.println("Arr2排序前:"+Arrays.toString(intArr2));
        long start2 = System.currentTimeMillis();
        bubble(intArr2);
        long end2 = System.currentTimeMillis();
        System.out.println("Arr2排序后:"+Arrays.toString(intArr2));
        System.out.println("冒泡排序耗时:"+(end2-start2)+"ms");
    }

    static void bubble(int[] s){
        for (int i = 0; i < s.length -1; i++){
            for (int j = 0; j < s.length - i - 1; j++ ){
                if (s[j] > s[j+1]){
                    int temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
    }

    static void sort(int[] s, int l, int r){
        if (l < r){
            int i = l, j = r, x = s[i];
            while (i < j){
                while (i < j && x <= s[j]) j--;
                if (i < j) s[i++] = s[j];
                while (i < j && x > s[i]) i++;
                if (i < j) s[j--] = s[i];
            }
            s[i] = x;
            sort(s,l,i-1);
            sort(s,i+1,r);
        }
    }

    //快排的详细解析版
    static void sort1(int[] s, int l, int r){//初始左指针传0，右指针传s.length-1
        if (l < r){//左区间指针小于右区间指针
            int i = l,  j = r,  x = s[l];
            //第一步：简单排序，使得s[l]前面的都比他小，后面的都比他大
            while(i < j){//左区间指针小于右区间指针
                while(i < j && s[j] >= x) j--;//对比的是右区间指针的元素,并将右区间指针不断向左移动
                //如果跳出循环，那么就是找到了比x小的，此时的j下标就获取到了
                if (i < j) s[i++] = s[j];//这里做了两步操作：1.s[i]=s[j] 2.i++
                while (i<j && s[i] < x) ++i;//对比的是左区间指针的元素,并将左区间指针不断向右移动
                //如果跳出循环，那么就是找到了比x大的，此时i下标就获取到了
                if (i<j) s[j--] = s[i];//这里做了两步操作：1.s[j]=s[i] 2.j--
                //看到这里其实发现上面的步骤其实就是冒泡排序，x是中间变量，然后s[i]=s[j], s[j]=s[i]
            }
            s[i] = x;//此时i其实在分界点
            //现在空间被分成两份，i之前左区间的肯定比x小，之后的右区间肯定比x大
            sort1(s,l,i-1);
            sort1(s,i+1,r);
        }
    }
}
