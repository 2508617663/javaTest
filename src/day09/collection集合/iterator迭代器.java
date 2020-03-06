package day09.collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* iterator迭代器（集合中的遍历）
* collection中是没有索引的，所以不能用for循环来遍历
* 迭代器是一种通用的取出集合中数据的方式，不管什么集合都可以用迭代器取出数据
* 迭代工作原理：
*   迭代器在取出元素之间先要判断集合中有没有元素，如果有，就把这个元素取出来，继续再判断，如果还有就再取
*   出来，一直把集合中所有元素全部取出来，这种取出方式被称为迭代
*
* iterator中常用方法：
*   hasNext() 如果仍有元素可以迭代，则返回 true。
*       判断集合中还有没有下一个元素，有就返回true，没有就返回false
*   next() 返回迭代的下一个元素。
*       取出集合中下一个元素
* Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
* Collection接口中有一个方法，叫iterator()，这个方法返回的就是迭代器的实现类对象
*
* 迭代器的使用步骤（重点）：
*   1，使用集合中的方法iterator()方法获取迭代器的实现类对象，使用Iterator接口接收（多态）
*   2，使用Iterator接口中的方法hasNext()判断还有没有下一个元素
*   3，使用Iterator接口中的方法next()取出集合中的下一个元素
*
*
* */
public class iterator迭代器 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");

        /**
         * 1，使用集合中的方法iterator()获取迭代器的实现类对象，使用iterator接口接收（多态）
         * 注意：
         *  Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         * */

        //接口                    实现类对象
        Iterator<String> it = coll.iterator();  //获取一个迭代器
        /**2，使用Iterator接口中的方法hasNext()判断还有没有下一个元素*/
        //boolean b = it.hasNext();
        //System.out.println(b);  //返回为true  证明还有下一个元素
        /**3，使用Iterator接口中的方法next()取出集合中的下一个元素*/
        //String s = it.next();
        //System.out.println(s);  //成功取出第一个元素  但是这三行代码只取出了一个元素，代码太复杂

        //用for循环的方式简化代码
//        for (int i = 0; i <coll.size() ; i++) {
//            if (it.hasNext()){
//                System.out.println(it.next());
//            }
//        }
        //while循环的方式简化代码：
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
