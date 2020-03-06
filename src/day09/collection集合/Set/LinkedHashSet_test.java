package day09.collection集合.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *java。util.LinkedHashSet集合 extends HashSet集合
 * LinkedHashSet集合特点：
 *      底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 *
 * HashSet集合是：无序，不允许重复
 * LinkedHashSet集合是：有序，不允许重复
 *
 *
 * */
public class LinkedHashSet_test {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("ccc");
        System.out.println(set);//[aaa, ccc, bbb]   HashSet集合是：无序，不允许重复


        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("aaa");
        linked.add("ccc");
        linked.add("ddd");
        linked.add("bbb");
        System.out.println(linked);//[aaa, bbb, ccc, ddd] LinkedHashSet集合是：有序，不允许重复
    }
}
