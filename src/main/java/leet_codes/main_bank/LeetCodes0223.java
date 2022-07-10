package leet_codes.main_bank;

public class LeetCodes0223 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //确定四种不相交的情况，并返回0
        if (bx1 >= ax2 || bx2 <= ax1 || by2 <= ay1 || by1 >= ay2) return getSum(bx1,bx2,by1,by2) + getSum(ax1,ax2,ay1,ay2);
        //确定全包含相交的情况（四个点都包）
        if (ax1<=bx1&&ay1<=by1&&ay2>=by2&&ax2>=bx2) return getSum(ax1,ax2,ay1,ay2);
        if (bx1<=ax1&&bx2>=ax2&&by1<=ay1&&by2>=ay2) return getSum(bx1,bx2,by1,by2);
        //相交情况的话对x和y分别进行排序，取中间两个相减绝对值相乘
        int[] arrX = new int[]{ax1,ax2,bx1,bx2};
        int[] arrY = new int[]{ay1,ay2,by1,by2};
        sort(arrX, 0, arrX.length -1);
        sort(arrY,0,arrY.length -1);
        //计算: 覆盖总面积=两面积和-相交面积
        int result = getSum(bx1,bx2,by1,by2) + getSum(ax1,ax2,ay1,ay2) - getSum(arrX[1],arrX[2],arrY[1],arrY[2]);
        return result;
    }

    public int getSum(int x1, int x2, int y1, int y2) {
        return Math.abs(x2-x1) * Math.abs(y2-y1);
    }

    public  void sort(int[] arr, int l, int r) {
        if (l < r) {
            int i = l, j = r, x = arr[i];
            while (i < j) {
                while (i < j && arr[j] >= x) j--;
                if (i < j) arr[i++] = arr[j];
                while (i<j && arr[i] < x) ++i;
                if (i<j) arr[j--] = arr[i];
            }
            arr[i] = x;//此时i其实在分界点
            //现在空间被分成两份，i之前左区间的肯定比x小，之后的右区间肯定比x大
            sort(arr,l,i-1);
            sort(arr,i+1,r);
        }
    }
}
