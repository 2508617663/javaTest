package day09.双列集合_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map.Entry<K,V>：在Map接口中有一个内部接口Entry
 * 当Map集合一创建，那么就会在Map集合中创建一个Entry对象，用来记录键与值之间的映射关系——>结婚证
 * Entry对象用来记录键（key）和值（value）之间的关系（相当于结婚证，确保键与值不能乱套）
 * java.util.Map中有一个方法：Set<Map.Entry<K,V>> entrySet()
 * Set<Map.Entry<K,V>> entrySet()：把Map集合内部多个Entry对象取出来（有几个键值对就有几个Entry对象）存储到一个Set集合中，
 * 然后就可以对存储了键值对的Entry对象的Set集合进行遍历，Set集合遍历方法：迭代器，foreach
 *
 * */
public class Map_Entry {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("AA","aa");
        map.put("BB","bb");
        map.put("CC","cc");
        map.put("DD","dd");
        System.out.println(map);//{AA=aa, BB=bb, CC=cc, DD=dd}
        /**public V Set<Map.Entry<K,V>> entrySet()：获取到Map集合中所有的键值对对象的集合（Set集合）（遍历集合作用）*/
        Set<Map.Entry<String, String>> entry = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entry.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }

    }
}
