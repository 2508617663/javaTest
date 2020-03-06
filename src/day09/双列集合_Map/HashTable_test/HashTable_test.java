package day09.双列集合_Map.HashTable_test;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * java.util.Hashtable<K,V>
 *     java.util.Hashtable<K,V> extends Dictionary<K,V>抽象类
 *     java.util.Hashtable<K,V> implements Map<K,V>, Cloneable, java.io.Serializable
 * java.util.Hashtable<K,V> 子类：Properties, UIDefaults
 *
 * Hashtable：底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
 * HashMap：底层也是一个哈希表，是一个线程【不安全】的集合，是多线程集合，速度快
 *
 * HashMap，List，Set集合都可以存储null键，null值，但是null值也存在重复后被替换的问题
 * Hashtable集合：不能存储null键，null值  ，存入null值将会发生空指针异常：java.lang.NullPointerException
 *
 * Hashtable和Vector集合一样，在JDK1.2版本之后被更先进的集合（HashMap，ArrayList）取代了
 * 但是Hashtable的子类Properties依然活跃
 * 注意：
 *      【properties集合是一个唯一和IO流相结合的集合】
 *
 *
 *
 * */
public class HashTable_test {
    public static void main(String[] args) {
        HashMap<String,String> map01 = new HashMap<>();
        map01.put(null,"TicketImpl");
        map01.put("A",null);
        map01.put(null,null);
        System.out.println(map01);//{null=null, A=null}  HashMap可以存储null值，但是null值也存在重复被替换的问题


        Hashtable<String,String> map02 = new Hashtable<>();
        map02.put("AA","aa");
//        map02.put(null,null); //空指针异常：java.lang.NullPointerException
        System.out.println(map02);

    }
}
