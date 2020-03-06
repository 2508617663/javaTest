package day09.collection集合.List;

import java.util.LinkedList;
import java.util.List;

/**
 * java.util.LinkedList集合 implements  List接口
 * LinkedList集合的特点：
 * List集合的特点它都有：有序，有索引，元素允许重复
 *  1，底层是一个链表结构：查询慢，增删快
 *  2，里边包含了大量操作首尾元素的方法
 *  注意：使用LinkedList集合特有的方法，不能使用多态
 *  public void addFirst(E e)：将指定元素插入此列表的开头
 *  public void addLast(E e)：将指定元素添加到此列表的结尾
 *  public void push(E e)：将元素推入此列表所表示的堆栈    //此方法等效于 addFirst(E)。
 *  public E getFirst()：获取此列表的第一个元素
 *  public E getLast()：获取此列表的最后一个元素
 *  public E removeFirst()：删除此列表第一个元素
 *  public E removeLast()：删除此列表最后一个元素
 *  public E pop()：从此列表所表示的堆栈处弹出一个元素  //输出第一个元素
 *  public boolean isEmpty()：如果列表不包含元素，则返回true
 *
 * */
public class LinkedList_Test {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        LinkedList<String> list = new LinkedList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        System.out.println(list);

        /**public void addFirst(E e)：将指定元素插入此列表的开头*/
        list.addFirst("www");
        System.out.println(list);   //[www, 迪丽热巴, 古力娜扎, 玛尔扎哈]

        /**public void addLast(E e)：将指定元素添加到此列表的结尾*/
        list.addLast("com");
        System.out.println(list);//[www, 迪丽热巴, 古力娜扎, 玛尔扎哈, com]

        /**public void push(E e)：将元素推入此列表所表示的堆栈 //此方法等效于 addFirst(E)。*/
        list.push("asdasd");
        System.out.println(list);

        /**public E getFirst()：获取此列表的第一个元素*/
        System.out.println(list.getFirst());    //asdasd

        /**public E getLast()：获取此列表的最后一个元素*/
        System.out.println(list.getLast());     //com

        /**public E removeFirst()：删除此列表第一个元素*/
//        System.out.println(list);   [asdasd, www, 迪丽热巴, 古力娜扎, 玛尔扎哈, com]
        list.removeFirst();
        System.out.println(list);   //[www, 迪丽热巴, 古力娜扎, 玛尔扎哈, com]

        /**public E removeLast()：删除此列表最后一个元素*/
        list.removeLast();
        System.out.println(list);   //[www, 迪丽热巴, 古力娜扎, 玛尔扎哈]

        /**public E pop()：从此列表所表示的堆栈处弹出一个元素*/       //输出第一个元素
        System.out.println(list.pop());
    }
}
