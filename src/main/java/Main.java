import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/*
这是一个测试类
 */
public class Main {
    public static void main(String[] args) {
//        int[] num = new int[]{1,2,3,4,1,2,3,4,1,2,3,4,5};
//        int[] num = new int[]{1,2,3,4,5};
        int[] num = new int[]{1,2,3,4,5};
        int a = num[0];
        for (int i = 1; i < num.length; i++){
            a ^= num[i];
        }
        System.out.println(a);
    }
//    public static void main(String[] args) {
//        int i = 1;
//        i = i++;
//        System.out.println(i);
//        int j = 1;
//        j = ++j;
//        System.out.println(j);
//    }

//    public static void main(String[] args) {
//        String str = "bc123bcd12345";
//        System.out.println(maxSubString(str));
//    }
//    static String maxSubString(String str){
//        String result = "";
//        StringBuilder sb = null;
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++){
//            if (isNum(""+chars[i])){
//                if (sb == null) sb = new StringBuilder("");
//                sb.append(""+chars[i]);
//            }else{
//                String sbStr = sb==null?"":new String((sb));
//                result  = (sbStr.length() > result.length())? sbStr : result;
//                sb = null;
//            }
//        }
//        String sbStr = sb==null?"":new String(sb);
//        return sb.length()>result.length()?sbStr:result;
//    }
//
//    static boolean isNum(String s){
//        Pattern pattern = Pattern.compile("[0-9]*");
//        return  pattern.matcher(s).matches();
//    }
//    public static void main(String[] args) {
//        int[][] input = new int[][]{{1,1,1,1,0},
//                                    {1,1,1,1,0},
//                                    {1,0,0,0,1}};
//        int count = 0;//计数输出
//        int[][] checked = new int[input.length][input[0].length];
//        for (int i = 0; i < input.length; i++){
//            for (int j =0; j < input[0].length; j++){
//                if (input[i][j] == 1 && checked[i][j] == 0) {
//                    checked[i][j] = 1;
//                    check(input,checked,i,j);
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//
//
//    static void check(int[][] input, int[][] checked, int i, int j) {
//        //向上走
//        if (i-1 >= 0  && input[i-1][j]==1 && checked[i-1][j] == 0) {
//            checked[i-1][j] = 1;
//            check(input,checked,i-1,j);
//        }
//        //向下走
//        if (i+1 < input.length && input[i+1][j]==1 && checked[i+1][j] == 0){
//            checked[i+1][j] = 1;
//            check(input,checked,i+1,j);
//        }
//        //向左走
//        if (j-1>=0 && input[i][j-1]==1 && checked[i][j-1] == 0){
//            checked[i][j-1] = 1;
//            check(input,checked, i, j-1);
//        }
//        //向右走
//        if (j+1<input[0].length && input[i][j+1]==1 && checked[i][j+1] == 0){
//            checked[i][j+1] = 1;
//            check(input,checked,i,j+1);
//        }
//    }

    //当前元素为input[i][j], 为水的时候进行跳过
//                if (input[i][j] == 0) continue;
//               //上
//                int up = 0;
//                if (i-1<=0)  up = 0;
//                else up = input[i-1][j];
//                //下
//                int down = 0;
//                if (i+1>=input.length) down = 0;
//                else down = input[i+1][j];
//                //左
//                int left = 0;
//                if (j-1<=0) left =0;
//                else left = input[i][j-1];
//                //右
//                int right =0;
//                if (j+1>=input[i].length) right = 0;
//                else right = input[i][j+1];
//                if (up+down+left+right == 0) count++;//四周都是水的时候
//    static boolean hasPathSum(TreeNode root, int targetSum) {
//        List<Integer> pool = new ArrayList<Integer>();
//        TreeNode node = root;
//        int sum = root.val;
//        if(node.left != null || node.right != null){
//        }
//        while (node.left != null || node.right != null){
//            if (node.left != null && node.right != node){
//                node =
//            }else if (node.left!=null){
//                node = node.left;
//                sum += node.val;
//            }else if (node.right!=null){
//                node = node.right;
//                sum += node.val;
//            }
//        }
//        pool.add(sum);
//
//
//
//
//    }
//
//    static void check(TreeNode treeNode, int ){
//
//    }
//
//public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//         this.left = left;
//          this.right = right;
//      }
//  }


//        Scanner sc = new Scanner(System.in);
//        TreeSet<String> allHour = new TreeSet<String>();
//        for (int i = 0; i <= 23; i++){
//            allHour.add(i<10?"0"+i:""+i);
//        }
//        TreeSet<String> allSecond = new TreeSet<String>();
//        for (int i = 0; i <= 59; i++){
//            allSecond.add(i<10?"0"+i:""+i);
//        }
//
//        String str = sc.nextLine();
//        int hour = Integer.parseInt(str.substring(0,2));
//        int second = Integer.parseInt(str.substring(3,5));
//        String[] pool = new String[4];
//        pool[0] = ""+str.charAt(0);
//        pool[1] = ""+str.charAt(1);
//        pool[2] = ""+str.charAt(3);
//        pool[3] = ""+str.charAt(4);
//
//        //在当天范围内的比较
//        String hourCheck = "";
//        for (int i = 0; i < 4; i++){
//            for (int j = 0; j <4; j++){
//                hourCheck = pool[i]+pool[j];
//                if (allHour.contains(hourCheck) && Integer.parseInt(hourCheck) >= hour){
//
//                }
//            }
//        }
//        System.out.println("时间不够了");
//
//    }
//    public static void main(String[] args) {
//        //x只要移动就会增加面积
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        int maxX = sc.nextInt();
//        int totalSq = 0;
//        int lastX = 0;
//        int lastY = 0;
//        //用x增加的距离*y当前的距离=每次增加的面积
//        for (int i = 1; i <= count; i++){
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            totalSq += (x-lastX)*Math.abs(lastY);
//            lastY += y;
//            lastX = x;
//        }
//        totalSq += (maxX-lastX)*Math.abs(lastY);
//        System.out.println(totalSq);
//    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] arr = str.split(" ");
//        int[] intArr = new int[arr.length];
//        for (int i = 0; i < intArr.length; i++){
//            if (!isNum(arr[i])){
//                System.out.print("[]");
//                return;
//            }
//            intArr[i] = Integer.parseInt(arr[i]);
//        }
//
//        int i = 0;
//        while (i < intArr.length -1){
//            if (intArr[i] < intArr[i+1]){
//                int temp = intArr[i];
//                intArr[i] = intArr[i+1];
//                intArr[i+1] = temp;
//            }
//            i+=2;
//        }
//        int j = 1;
//        while (j < intArr.length -1){
//            if (intArr[j] > intArr[j+1]){
//                int temp = intArr[j];
//                intArr[j] = intArr[j+1];
//                intArr[j+1] = temp;
//            }
//            j+=2;
//        }
//
//
//        Iterator it = Arrays.stream(intArr).iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//    }
//
//    static boolean isNum(String s){
//        Pattern p = Pattern.compile("[0-9]*");
//        return p.matcher(s).matches();
//    }

//    class Solution {
//        private int[][] visited;        //标记数组，标记有没有走过
//        private int row;
//        private int col;
//        public void dfs(int i,int j,char [][]grid){
//            //如果没有走到上边的边界
//            //并且上边仍然是陆地，且没有走过
//            if(i-1>=0 && (grid[i-1][j]=='1' && visited[i-1][j]==0)){
//                visited[i-1][j]=1;
//                dfs(i-1,j,grid);
//            }
//            //向下走
//            if(i+1<row && (grid[i+1][j]=='1' && visited[i+1][j]==0)){
//                visited[i+1][j]=1;
//                dfs(i+1,j,grid);
//            }
//            //向左走
//            if(j-1>=0 && (grid[i][j-1]=='1' && visited[i][j-1]==0)){
//                visited[i][j-1]=1;
//                dfs(i,j-1,grid);
//            }
//            //向右走
//            if(j+1<col && (grid[i][j+1]=='1' && visited[i][j+1]==0)){
//                visited[i][j+1]=1;
//                dfs(i,j+1,grid);
//            }
//        }
//        public int numIslands(char[][] grid) {
//            row=grid.length;
//            col=grid[0].length;
//            int count=0;            //统计岛屿数量
//            visited=new int[row][col];
//            //在外层用一个for循环，对每个元素尝试以它为起点进行遍历
//            //每次遍历的时候就可以遍历一个连通图（即一个岛屿）
//            for(int i=0;i<row;i++){
//                for(int j=0;j<col;j++){
//                    if(grid[i][j]=='1' && visited[i][j]==0){
//                        visited[i][j]=1;
//                        dfs(i,j,grid);
//                        count++;
//                    }
//                }
//            }
//            return count;
//        }
//    }


}
