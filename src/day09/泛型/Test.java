package day09.泛型;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型：是一种未知的数据类型，当我们不知道使用什么数据类型的时候就可以使用泛型
 * 泛型也可以看作是一个变量，用来接收数据类型
 * 注意：迭代器的泛型会跟着集合走，集合是String类泛型的时候迭代器也是String类型的泛型，集合是Object，迭代器也是Object
 *
 * */
public class Test {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();     //不加上泛型
        ArrayList<String> list = new ArrayList<>(); //加上String类型的泛型


        //Method01(); 不使用泛型
        Method02();

    }
    /**
     * 创建集合对象不使用泛型
     * 好处：集合不适用泛型，所以类型就是Object类型，可以存储任意类型的数据
     * 弊端：不安全，会引发异常
     * 假如存入一个整型一个字符串型，想用.length方法，但是.length方法是Object的子类特有的方法，而泛型是Object，所以这里将会出现异常
     * */
    /*private static void Method01() {
        ArrayList list = new ArrayList();   //没有使用泛型的集合
        list.add("abc");
        list.add(123);

        //获取迭代器
        Iterator it = list.iterator();
        //遍历集合
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

//        System.out.println(list.length);  //泛型是Object类型的话就无法使用子类特有方法，只能使用Object中自己的方法
        //所以这里要向下转型
            String s = (String) obj;
            System.out.println(s.length());

        }
    }*/


    /**
     * 创建集合对象，使用泛型：
     * 好处：
     *  1，避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
     *  2，把运行期异常，提升到了编译器
     * 弊端：
     *  泛型是什么类型，就只能存储什么类型的数据
     *
     * */
    private static void Method02() {
        ArrayList<String> list = new ArrayList<>(); //定义一个字符串泛型的集合
        list.add("张三");
//        list.add(3.14); //定义了字符串泛型的集合就只能存储字符串
//        list.add(true);

        //使用迭代器遍历集合
        Iterator<String> it = list.iterator(); //注意：迭代器的泛型是跟着集合走的，集合是String所以这里也是String
        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }

    }
}
