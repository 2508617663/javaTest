package day09.collection集合;

import java.util.ArrayList;
import java.util.Collections;

/*
* 学习目标：
* 1，会使用集合存储数据
* 2，会遍历集合，把数据取出来
* 3，掌握每种集合的特性
*
* collection集合框架
* List接口：1,Vector   2,ArrayList     3,LinkedList_Test
*   List特性：
*       1，有序的集合
*       2，允许存储重复的数据
*       3，有索引，可以使用普通的for循环遍历
* Set接口：1,TreeSet   2,HashSet   3,LinkedHashSet_test
*   Set特性：
*       1，不允许存储重复的数据
*       2，没有索引（不能使用普通的for循环遍历）
*       3
*
* collection中常用的方法（List，Set下所有子类都可使用）
*   public boolean add(E e) :把给定的对象添加到当前集合中
*   public void clear():清空集合中所有的元素
*   public boolean remover(E e):把指定的对象在当前集合中删除
*   public boolean contains(E e):判断当前集合中是否包含指定的对象
*   public boolean isEmpty():判断当前集合是否为空
*   public int size():返回集合中元素的个数
*   public Object[] toArray():把集合中的元素储存到数组中
*
*
*
* */
public class collection_Test {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Integer> list = new ArrayList<>(); //也可以使用多态写法：Collections list = new ArrayList<>();
        /** public boolean add(E e) :把给定的对象添加到当前集合中*/
        list.add(10);
        list.add(20);
        System.out.println(list);//打印list内容：[10, 20]

        /**public void clear():清空集合中所有的元素*/
        //list.clear();
        //System.out.println(list);//打印list内容：[]

        /**public boolean remover(E e):把指定的对象在当前集合中删除     //删除索引为0的内容*/
        //list.remove(0);
        //System.out.println(list);//[20]

        /**public boolean contains(E e):判断当前集合中是否包含指定的对象*/
        System.out.println(list.contains(10));  //true

        /**public boolean isEmpty():判断当前集合是否为空*/
        System.out.println(list.isEmpty()); //false

        /**public int size():返回集合中元素的个数*/
        System.out.println(list.size());

        /**public Object[] toArray():把集合中的元素储存到数组中*/
        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr);    //10  20
    }
}
