package day06.Arrays;

import java.util.Arrays;

/*
* Array是一个与数组相关的工具类,里面提供了大量静态方法,用来实现数组常见的操作
* public static String toString(数组)  将参数数组变成字符串(按照默认格式:[值1],[值2],[值3])
* public static void sort(数组)   按照默认升序(从小到大)对数组的元素进行排序
*
* */
public class Arrays_Test {
    public static void main(String[] args) {
        int[] intarr = {1,2,3,4};
        //将int数组按照默认格式转换成字符串
        String s = Arrays.toString(intarr);
        System.out.println(s);  //[1, 2, 3, 4]

        //public static void sort(数组)   按照默认升序(从小到大)对数组的元素进行排序
        int[] intarr2 = {1, 5, 3, 8, 4, 8, 9};
        //对数组进行排序
        Arrays.sort(intarr2);
        //在把排序后的数组转化为字符串
        System.out.println(Arrays.toString(intarr2));

        //对字符数组进行排序
        String[] str = {"TicketImpl","s","c","q","w","r"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

    }
}
