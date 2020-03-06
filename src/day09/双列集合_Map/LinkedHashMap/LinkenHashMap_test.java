package day09.双列集合_Map.LinkedHashMap;


import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 *     Map接口的哈希表和链表列表实现，具有可预知的迭代顺序
 * 底层原理：哈希表+链表（记录元素的顺序）
 *
 *
 * */
public class LinkenHashMap_test {
    public static void main(String[] args) {
        /**HashMap集合：无序集合*/
        HashMap<Integer,String> map01 = new HashMap<>();
        map01.put(04,"赵六");
        map01.put(02,"李四");
        map01.put(03,"王五");
        map01.put(01,"张三");
        System.out.println(map01);//存入是4231  取出是1234

        /**LinkedHashMap集合：有序集合*/
        LinkedHashMap<Integer,String> map02 = new LinkedHashMap<>();
        map02.put(01,"张三");
        map02.put(04,"赵六");
        map02.put(03,"王五");
        map02.put(02,"李四");
        System.out.println(map02);//存入是：1432  取出是1432
    }
}
