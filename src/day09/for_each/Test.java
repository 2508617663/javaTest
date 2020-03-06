package day09.for_each;

import java.util.ArrayList;

/**
* foreach
* 增强for循环：底层使用的也是迭代器，只不过是使用简化的for循环而已
* for_each是JDK1.5之后出现的新特性,专门用来遍历数组和集合的，它的内部原理其实是个Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作
*
* 增强for循环（foreach）：用来遍历集合和数组
* 格式：
*  for(集合/数组的数据类型 变量名：集合名/数组名){
*   sout(变量名);
* }
*
*
* */
public class Test {
    public static void main(String[] args) {
        Method01();//使用foreach遍历数组
        Method02();//使用foreach遍历集合
    }

    //使用foreach遍历数组
    private static void Method01() {
        int[] arr = {10,20,30,40};
        for (int i : arr){
            System.out.println(i);
        }
    }
    //使用foreach遍历集合
    private static void Method02() {
        ArrayList<String> list = new ArrayList<>(); //创建集合
        list.add("迪丽热巴");   //插入数据
        list.add("古力娜扎");
        list.add("马尔扎哈");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
