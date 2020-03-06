package day09.双列集合_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Map集合无法直接遍历，但是可以通过遍历键，通过键找值的方式遍历
 * 遍历Map集合的两种方法：ketSet()    entrySet()
 * Map集合遍历思路：
 * 把Map集合中所有的Key存入Set集合中进行遍历（迭代器，foreach） 拿到遍历完的key值后再调用get(Object Key)方法取到对应的值，全部输出完成遍历
 *
 *     public V Set<K> ketSet()：获取Map集合中所有的键，存储到Set集合中（遍历集合作用）
 *     public V Set<Map.Entry<K,V>> entrySet()：获取到Map集合中所有的键值对对象的集合（Set集合）（遍历集合作用）
 *
 *
 * */
public class Map_Set {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(01,"张三");
        map.put(02,"李四");
        map.put(03,"王五");
        map.put(04,"赵六");
        map.put(05,"吴七");
        System.out.println(map);//{1=张三, 2=李四, 3=王五, 4=赵六, 5=吴七}

        /** public V Set<K> ketSet()：获取Map集合中所有的键，存储到Set集合中（遍历集合作用）*/
        Set<Integer> set = map.keySet();//通过keySet方法取出map集合中所有的key，赋值给set  然后对set进行遍历

        //遍历set集合两种方式：foreach，迭代器
        //获取迭代器
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer next = it.next(); //把遍历出来的key值赋值给next
            String s = map.get(next); //用get(Object key)方法查找next对应的value值赋值给s
            System.out.println(next+"="+s);//用一个字符串拼接，把遍历出来的所有key+get方法取出的value：s
        }

    }
}
