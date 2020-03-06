package day09.collection集合.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.List接口  extends Collection接口
 * collection子类：List
 * List集合特点：
 * 1，List集合是有序的，存储和取出的顺序是一致的，
 * 2，List集合是有索引的
 * 3，List集合允许存储重复的内容
 *
 * List接口特有方法：
 *  1，public void add(int index, E element)：将指定的元素，添加到该集合中指定的位置上
 *  2，public E get(int index)：返回该集合中指定位置的元素
 *  3，public E remove(int index)：移除列表中指定位置的元素，返回的是被一处的元素
 *  4，public E set(int index , E element)：用指定元素替换集合中指定位置的元素，返回值的更新前的元素
 *
 *  注意越界异常错误:
 *      IndexOutOfBoundsException：索引越界异常，集合会报
 *      ArrayIndexOutOfBoundsException：数组索引越界异常
 *      StringIndexOutOfBoundsException：字符串索引越界异常
 *
 * */
public class List集合 {
    public static void main(String[] args) {
        //创建一个List集合
        List<String> list = new ArrayList<>();  //左父（接口）  右子（实现类）
        list.add("迪丽热巴");
        list.add("古力娜扎");
        /**1，public void add(int index, E element)：将指定的元素，添加到该集合中指定的位置上*/
        list.add(1,"玛尔扎哈"); //在1号索引前面添加元素“马尔扎哈”
        System.out.println(list);   //[迪丽热巴, 玛尔扎哈, 古力娜扎]

        /**2，public E get(int index)：返回该集合中指定位置的元素*/
        String s = list.get(1); //返回List集合中索引为0的元素
        System.out.println(s);  //玛尔扎哈

        /**3，public E remove(int index)：移除列表中指定位置的元素，返回的是被一处的元素*/
        System.out.println(list);   //打印List集合中全部元素：[迪丽热巴, 玛尔扎哈, 古力娜扎]
        list.remove("迪丽热巴"); //删除List集合中元素为“迪丽热巴”的元素
        System.out.println(list);   //打印List集合中全部元素：[玛尔扎哈, 古力娜扎]

        /**4，public E set(int index , E element)：用指定元素替换集合中指定位置的元素，返回值的更新前的元素*/
        System.out.println(list);   //[玛尔扎哈, 古力娜扎]
        list.set(0,"赵四");
        System.out.println(list); //把0号索引元素替换为“赵四”，由于1号索引元素已经在上面被删除所以打印结果为：[赵四, 古力娜扎]

        System.out.println("----------------");
        /**
         * 遍历数组：
         * 三种遍历方式：
         * */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String str:list){
            System.out.println(str);
        }

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
