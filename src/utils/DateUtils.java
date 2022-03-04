package utils;

public class DateUtils {
    /*
    计算某一年的第几天的日期字符串
    例：年 2021 天 378
    我的方法运用的递归，支持年数无限大，也支持第几天无限大
    当然了，此处的无限大也不能超过int类型的最大值，打个比方而已
     */
    public String getDateByYearAndNum(int a, int b) {
        String dateStr = "";
        int year = a;
        int num = b;
        if (num >= 365 && year % 4 != 0) {//大于365,且不是闰年
            num = num - 365;
            if (num == 0) return "" + year + "1231";
            year++;
        } else if (num >= 366 && year % 4 == 0) {//大于366,且是闰年
            num = num - 366;
            if (num == 0) return "" + year + "1231";
            year++;
        }
        if ((num >= 365 && year % 4 != 0) || (num >= 366 && year % 4 == 0)) {//还大？再调用它自己递归，返回值透传回来
            return getDateByYearAndNum(year, num);//递归
        } else {//进入日期计算
            int[] arr;
            if (year % 4 != 0)//不是闰年
                arr = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            else
                arr = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int month = 1;
            while (month <= arr.length) {
                num = num - arr[month - 1];
                if (num < 0) break;
                month++;
            }
            int day = arr[month - 1] + num;
            if (day == 0) {//处理临界值问题，每月最后一天。num为0时计数上要加一天
                month--;//要回到上一月
                day = arr[month - 1];
            }
            dateStr = "" + year + (month >= 10 ? "" + month : "0" + month) + (day >= 10 ? "" + day : "0" + day);//做了一下日期格式处理，小于10的前面补0展示
            return dateStr;
        }
    }

    public static void main(String[] args) {
        DateUtils dateUtils = new DateUtils();
        System.out.println(dateUtils.getDateByYearAndNum(10000,1000000));
    }
}
