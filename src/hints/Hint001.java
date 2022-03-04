package hints;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hint001 {
    public static void main(String[] args) {
        //声明一个map
        HashMap<String, String> map = new HashMap<>();
        map.put("a","123");
        map.put("b","456");
        map.put("c","789");
        //方法1：普通的foreach， 遍历的是key或者value
        for (String key : map.keySet()){
            System.out.println("method1_foreach key:"+key);
        }
        for (String val : map.values()){
            System.out.println("method1_foreach value:"+val);
        }
        for(String key : map.keySet()){
            System.out.println("method1_foreach key:"+ key + "; value:" + map.get(key));
        }
        //方法2：迭代器装载entry, 可以在遍历中同时使用map
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("method2_iterator: key:" + entry.getKey() + "; value:" + entry.getValue());
        }
        //方法3：entrySet foreach, 非常推荐
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("method3_entrySetForeach: key:" + entry.getKey() + "; value:"+entry.getValue());
        }
    }
}

