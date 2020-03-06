package day09.collection集合.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set接口 extends Collection接口
 * Set集合特点：
 *  1，不能包含重复元素
 *  2，所有元素没有索引，也不能用普通的for循环遍历
 *
 * java.util.HashSet集合 Implements Set接口
 * HashSet特点：
 *  1，不允许存储重复的元素
 *  2，没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 *  3，是一个无序的集合，存储元素和取出元素的顺序有可能不一致
 *  4，底层是一个哈希表结构（查询速度非常快）
 *
 * */
public class Set集合 {
    public static void main(String[] args) {
        //创建一个Set集合
        Set<Integer> set = new HashSet<>();
        //往Set集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);//[1, 2, 3]  打印的顺序和存入的顺序不一致，并且相同的数据没有存进去

        //使用迭代器遍历for循环
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());//输出结果为：1  2  3
        }

        //使用for eath 遍历
        for (int a: set){
            System.out.println(a); //输出为1  2  3
        }
    }
}
