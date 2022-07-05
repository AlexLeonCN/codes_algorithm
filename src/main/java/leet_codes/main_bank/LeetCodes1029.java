package leet_codes.main_bank;

import java.util.Arrays;

public class LeetCodes1029 {
    //costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
    //按照 price_A - price_B 从小到大排序；
    //将前N个人飞往 A 市，其余人飞往 B 市，并计算出总费用
    public int twoCitySchedCost(int[][] costs) {
        if (costs.length % 2 != 0) throw new RuntimeException("Params Invalidation");
        int[][] costArr = costs;
        quickSortAminB(costArr, 0, costArr.length-1);
        int sum = 0;
        for (int i = 0; i < costArr.length/2; i++) {
            sum += costArr[i][0];
        }
        for (int i = costArr.length/2; i < costArr.length; i++) {
            sum += costArr[i][1];
        }
        return sum;
    }

    private void quickSortAminB(int[][] costArr, int l, int r){
        if (l < r) {
            int i = l, j = r;
            int[] x = costArr[i];
            while (i < j) {
                while (i < j && costArr[j][0]-costArr[j][1] >= x[0] - x[1]) j--;
                if (i < j) costArr[i++] = costArr[j];
                while (i < j && costArr[i][0] - costArr[i][1] < x[0] - x[1]) i++;
                if (i < j) costArr[j--] = costArr[i];
            }
            costArr[i] = x;
            quickSortAminB(costArr, l , i - 1);
            quickSortAminB(costArr, i+1 , r);
        }
    }
}
