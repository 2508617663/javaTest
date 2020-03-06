package day09.双列集合_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * java.util.Map<K,V>集合
 * Map集合的特点:
 *      1，Map集合是一个双列集合，一个元素包含两个值（K:key , V:value）
 *      2，Map集合中的元素，Key和Value的数据类型可以相同，也可以不同
 *      3，Map集合中的元素，Key是不允许重复的，Value是可以重复的
 *      4，Map集合中的元素，Key和Value是一一对应的
 *
 * Map中常用方法：
 *      public V put(K key,V value)：把指定的键与指定的值添加到Map集合中
 *      public V remove(Object key)：把指定的键 所对应的键值对元素在Map集合中删除，返回被删除元素的值
 *      public V get(Object key)：根据指定的键，在Map集合中获取对应的值
 *      public boolean containsKey(Object key)：判断集合中是否包含指定的键
 *
 *      public V Set<K> ketSet()：获取Map集合中所有的键，存储到Set集合中（遍历集合作用）
 *      public V Set<Map.Entry<K,V>> entrySet()：获取到Map集合中所有的键值对对象的集合（Set集合）（遍历集合作用）
 *
 *
 * */
public class Map_test {
    public static void main(String[] args) {
        //创建一个HashMap对象
        Map<Integer,String> map = new HashMap<>();
        /**public V put(K key,V value)：把指定的键与指定的值添加到Map集合中
         * 返回值V：存储键值对的时候，key不重复，返回值是null
         *          存储键值对的时候，key重复，会使用新的value替换map中重复的value值，返回被替换的value值
         * */
        System.out.println(map.put(01,"aa"));   //null      key(01)不重复，所以返回null
        System.out.println(map.put(01,"bb"));   //aa        key(01)重复，返回被替换掉的值，aa被替换掉，所以输出aa
        System.out.println(map.put(02,"bb"));   //null      key(02)不重复，所以返回null
        System.out.println(map.put(03,"cc"));   //null      key(03)不重复，所以返回null
        System.out.println(map.put(04,"dd"));   //null      key(04)不重复，所以返回null
        System.out.println(map.put(05,"ee"));   //null      key(04)不重复，所以返回null
        System.out.println(map);//{1=bb, 2=bb, 3=cc, 4=dd, 5=ee}

       /**public V remove(Object key)：把指定的键 所对应的键值对元素在Map集合中删除，返回被删除元素的值
        * 返回值V：把删除的key对应的value值输出
        * */
        System.out.println(map);//{1=bb, 2=bb, 3=cc, 4=dd, 5=ee}
        System.out.println(map.remove(05)); //删除key=05的元素   05="ee"
        System.out.println(map);//{1=bb, 2=bb, 3=cc, 4=dd}

        /**public V get(Object key)：根据指定的键，在Map集合中获取对应的值
         * 返回值V：返回get查到的key对应的value值
         * */
        System.out.println(map.get(01));//bb
        System.out.println(map.get(10));//null  有key则返回对应的value 没有key则返回为null

        /**public boolean containsKey(Object key)：判断集合中是否包含指定的键
         * 返回值：如果有返回true ， 如果没有则返回false
         * */
        System.out.println(map.containsKey(1)); //true
        System.out.println(map.containsKey(10)); //false
        //同理containsValue(Object value)也是一样，有则返回true 没有则返回false
        System.out.println(map.containsValue("bb"));//true
        System.out.println(map.containsValue("gg"));//false


        /**public V Set<K> ketSet()：获取Map集合中所有的键，存储到Set集合中（遍历集合）*/


    }
}
