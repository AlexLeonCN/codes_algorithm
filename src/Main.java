/*
这是一个测试类
 */
public class Main {
    public static void main(String[] args) {

    }
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
}
