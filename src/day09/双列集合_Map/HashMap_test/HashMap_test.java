package day09.双列集合_Map.HashMap_test;
/**
 * java.util.Map<K,V>集合
 * Map集合的特点:
 *      1，Map集合是一个双列集合，一个元素包含两个值（K:key , V:value）
 *      2，Map集合中的元素，Key和Value的数据类型可以相同，也可以不同
 *      3，Map集合中的元素，Key是不允许重复的，Value是可以重复的
 *      4，Map集合中的元素，Key和Value是一一对应的
 * java.util.HashMap<K,V>集合 implements Map<K,V>接口
 * HashMap集合的特点：
 *      1，HashMap集合底层是哈希表：查询的速度特别快
 *          JDK1.8之间：数组+单向链表
 *          JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询速度
 *      2，HashMap集合是一个无序的集合，存储元素和取出元素的顺序可能不一致
 *
 * java.util.LinkedHashMap<K,V>集合 extends HashMap<K,V>集合
 * LinkedHashMap的特点：
 *      1，LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
 *      2，LinkedHashMap集合是有序集合，存储元素和取出元素的顺序是一致的
 *
 *
 **/
public class HashMap_test {
}
