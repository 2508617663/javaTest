package day09.泛型.泛型通配符;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 当使用泛型类或者接口时，传递的数据中，泛型类型不可确定，可以通过通配符：<?> 表示，但是一旦使用泛型的通配符后，只能使用Object类中
 * 的共性方法，集合中元素自身方法无法使用
 * 通配符基本使用
 * 泛型的通配符：不知道使用什么类型来接收的时候，此时可以使用?表示未知通配符
 * 此时只能接收数据，不能往该集合中存储数据
 *
 * Demo01：
 *  ? :代表任意的数据类型
 * 使用方式：
 *  不能创建对象使用，只能作为方法的参数使用
 *
 * */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();//Integer类型
        list01.add(10);
        list01.add(20);

        ArrayList<String> list02 = new ArrayList<>();//String类型
        list02.add("迪丽热巴");
        list02.add("古力娜扎");

        Method(list01);
        Method(list02);
    }

    /**定义一个方法：能遍历所有ArrayList集合
     * 这时我们不知道ArrayList集合使用的是什么数据类型，所以这里可以使用泛型的通配符来接收数据类型
     * 注意：
     *      泛型没有继承概念的
     *      ArrayList<?> list02 = new ArrayList<>(); 集合在定义的时候不能使用通配符，因为通配符只能作为方法的参数使用
     *
     */
    public static void Method(ArrayList<?> list){ //如果这里不是使用通配符，用Integer的话 list02就无法作为参
                                                  // 数传过来，反之也一样，所以用通配符什么类型都可以往这里传，而且这里泛型用Object两个
                                                  // 都会报错，因为泛型没有继承概念
        //获取迭代器来遍历集合
        Iterator<?> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
